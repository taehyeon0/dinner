package ka.dinner.service.login;

import ka.dinner.domain.user.User;
import ka.dinner.repository.user.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class SearchUserByEmailService {

    private UserRepository userRepository;

    public User execute(String email) {
        User user = userRepository.selectByEmail(email);
        //TODO

        return user;
    }
}
