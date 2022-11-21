package ka.dinner.service.user;

import ka.dinner.domain.user.User;
import ka.dinner.repository.user.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.servlet.http.HttpSession;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class CheckPasswordService {

    private final UserRepository userRepository;

    public User execute(String password, HttpSession session) {
        User user = (User) session.getAttribute("loginUser");
        String email = user.getEmail();

        return userRepository.selectByEmailAndPassword(email, password);
    }
}
