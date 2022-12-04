package ka.dinner.service.user;

import ka.dinner.domain.user.User;
import ka.dinner.repository.user.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.servlet.http.HttpSession;

@Slf4j
@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class UserViewService {

    private final UserRepository userRepository;

    public User execute(HttpSession session) {
        User loginUser = (User) session.getAttribute("loginUser");
        int loginUserId = loginUser.getId();

        return userRepository.selectById(loginUserId);
    }
}
