package ka.dinner.service.login;

import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;

@Service
public class LogoutService {

    public void execute(HttpSession session) {
        session.invalidate();
    }
}
