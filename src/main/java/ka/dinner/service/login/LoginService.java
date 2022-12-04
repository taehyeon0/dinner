package ka.dinner.service.login;

import ka.dinner.domain.user.User;
import ka.dinner.dto.login.LoginDto;
import ka.dinner.repository.user.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.servlet.http.HttpSession;

@Service
@Transactional
@RequiredArgsConstructor
public class LoginService {

    private final UserRepository userRepository;

    public void execute(LoginDto dto, HttpSession session) {

        String email = dto.getEmail();
        String password = dto.getPassword();

        User user = userRepository.selectByEmailAndPassword(email, password);
        //TODO

        session.setAttribute("loginUser", user);
    }
}
