package ka.dinner.service.user;

import ka.dinner.domain.user.User;
import ka.dinner.domain.user.UserType;
import ka.dinner.repository.user.UserRepository;
import ka.dinner.repository.user.UserTypeRepository;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mock.web.MockHttpSession;
import org.springframework.transaction.annotation.Transactional;

import static org.assertj.core.api.Assertions.assertThat;

@Slf4j
@Transactional
@SpringBootTest
class UserDeleteServiceTest {

    @Autowired
    UserTypeRepository userTypeRepository;

    @Autowired
    UserRepository userRepository;

    @Autowired
    UserDeleteService userDeleteService;

    protected MockHttpSession session;

    @AfterEach
    void after() {
        session.clearAttributes();
        session = null;
    }

    @Test
    void execute() {
        //given
        UserType type = new UserType("TEST", "테스트용");
        userTypeRepository.insert(type);
        User user = new User(0, type,"test@naver.com","test","테스트","testAddress1","testAddress2",35,127,"01000000000",null,null);
        userRepository.insert(user);

        session = new MockHttpSession();
        session.setAttribute("loginUser", user);

        //when
        userDeleteService.execute(session);

        //then
        assertThat(userRepository.selectById(user.getId()).getRemoveDate()).isNotNull();
    }
}