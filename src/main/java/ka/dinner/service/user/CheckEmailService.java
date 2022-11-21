package ka.dinner.service.user;

import ka.dinner.domain.user.User;
import ka.dinner.repository.user.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class CheckEmailService {
    private final UserRepository userRepository;

    public User execute(String email) {
        User user = userRepository.selectByEmail(email);

        return user;
    }
}
