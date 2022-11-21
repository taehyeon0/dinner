package ka.dinner.service.user;

import ka.dinner.domain.user.User;
import ka.dinner.repository.user.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.servlet.http.HttpSession;

@Service
@Transactional
@RequiredArgsConstructor
public class UserDeleteService {

    private final UserRepository userRepository;

    public void execute(HttpSession session) {
        User user = (User) session.getAttribute("loginUser");
        int userId = user.getId();
        User targetUser = userRepository.selectById(userId);

        userRepository.delete(targetUser.getId());
    }
}
