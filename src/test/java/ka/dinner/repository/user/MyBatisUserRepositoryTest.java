package ka.dinner.repository.user;

import ka.dinner.domain.user.User;
import ka.dinner.domain.user.UserType;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Commit;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@Slf4j
@Transactional
@SpringBootTest
class MyBatisUserRepositoryTest {

    @Autowired
    UserRepository userRepository;

    @Autowired
    UserTypeRepository userTypeRepository;

    @Test
    void insert() {
        //given
        UserType type = new UserType("TEST", "테스트용");
        userTypeRepository.insert(type);
        User user = new User(0, type,"test@naver.com","test","테스트","testAddress1","testAddress2",35,127,"010-0000-0000",null,null);

        //when
        User result = userRepository.insert(user);

        //then
        assertThat(user).isEqualTo(result);
    }

    @Test
    void delete() {
        //given
        UserType type = new UserType("TEST", "테스트용");
        userTypeRepository.insert(type);
        User user = new User(0, type,"test@naver.com","test","테스트","testAddress1","testAddress2",35,127,"010-0000-0000",null,null);
        User insertedUser = userRepository.insert(user);

        //when
        userRepository.delete(insertedUser.getId());
        log.info("removeDate={}", userRepository.selectById(insertedUser.getId()).getRemoveDate());

        //then
        assertThat(userRepository.selectById(insertedUser.getId()).getRemoveDate()).isNotNull();
    }

    @Test
    void update() {
        //given
        UserType type = new UserType("TEST", "테스트용");
        userTypeRepository.insert(type);
        User user = new User(0, type,"test@naver.com","test","테스트","testAddress1","testAddress2",35,127,"010-0000-0000",null,null);
        User insertedUser = userRepository.insert(user);
        User updatedUser = new User(insertedUser.getId(), type,"test@naver.com","test","업데이트","testAddress1","testAddress2",35,127,"010-0000-0000",null,null);

        //when
        userRepository.update(updatedUser);

        //then
        assertThat(userRepository.selectById(insertedUser.getId()).getName()).isEqualTo("업데이트");
    }

    @Test
    void selectById() {
        //given
        UserType type = new UserType("TEST", "테스트용");
        userTypeRepository.insert(type);
        User user = new User(0, type,"test@naver.com","test","테스트","testAddress1","testAddress2",35,127,"010-0000-0000",null,null);
        User insertedUser = userRepository.insert(user);

        //when
        User result = userRepository.selectById(insertedUser.getId());

        //then
        assertThat(insertedUser.getId()).isEqualTo(result.getId());
    }

    @Test
    void selectByEmail() {
        //given
        UserType type = new UserType("TEST", "테스트용");
        userTypeRepository.insert(type);
        User user = new User(0, type,"test@naver.com","test","테스트","testAddress1","testAddress2",35,127,"010-0000-0000",null,null);
        User insertedUser = userRepository.insert(user);

        //when
        User result = userRepository.selectByEmail(insertedUser.getEmail());

        //then
        assertThat(insertedUser.getId()).isEqualTo(result.getId());
    }

    @Test
    void selectByEmailAndPassword() {
        //given
        UserType type = new UserType("TEST", "테스트용");
        userTypeRepository.insert(type);
        User user = new User(0, type,"test@naver.com","test","테스트","testAddress1","testAddress2",35,127,"010-0000-0000",null,null);
        User insertedUser = userRepository.insert(user);

        //when
        User result = userRepository.selectByEmailAndPassword(insertedUser.getEmail(), insertedUser.getPassword());

        //then
        assertThat(insertedUser.getId()).isEqualTo(result.getId());
    }

    @Commit
    @Test
    void selectAll() {
        //given
        UserType type = new UserType("TEST", "테스트용");
        userTypeRepository.insert(type);
        User user1 = new User(0, type,"test1@naver.com","test","테스트","testAddress1","testAddress2",35,127,"010-0000-0000",null,null);
        User insertedUser1 = userRepository.insert(user1);
        User user2 = new User(0, type,"test2@naver.com","test","테스트","testAddress1","testAddress2",35,127,"010-0000-0000",null,null);
        User insertedUser2 = userRepository.insert(user2);

        //when
        List<User> result = userRepository.selectAll();
        log.info("result {}", result);

        //then
        assertThat(result).containsExactly(user1, user2);
    }
}