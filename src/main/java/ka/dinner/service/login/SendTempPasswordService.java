package ka.dinner.service.login;

import ka.dinner.domain.user.User;
import ka.dinner.repository.user.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class SendTempPasswordService {

    private UserRepository userRepository;

    public void execute(User user) {
        //TODO
    }
}
