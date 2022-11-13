package ka.dinner.repository.user;

import ka.dinner.domain.user.UserType;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@Transactional
@SpringBootTest
class MyBatisUserTypeRepositoryTest {

    @Autowired
    UserTypeRepository userTypeRepository;

    @Test
    void insert() {
        //given
        UserType userType = new UserType("TEST", "테스트용");

        //when
        userTypeRepository.insert(userType);

        //then
        assertThat(userTypeRepository.selectById(userType.getId()).getId()).isEqualTo("TEST");
    }

    @Test
    void delete() {
        //given
        UserType userType = new UserType("TEST", "테스트용");
        userTypeRepository.insert(userType);

        //when
        userTypeRepository.delete("TEST");

        //then
        assertThat(userTypeRepository.selectById(userType.getId())).isNull();
    }

    @Test
    void update() {
        //given
        UserType userType = new UserType("TEST", "테스트용");
        userTypeRepository.insert(userType);

        //when
        userTypeRepository.update("TEST", "업데이트용");

        //then
        assertThat(userTypeRepository.selectById(userType.getId()).getName()).isEqualTo("업데이트용");
    }

    @Test
    void selectAll() {
        //given
        UserType userType1 = new UserType("TEST1", "테스트용1");
        UserType userType2 = new UserType("TEST2", "테스트용2");
        userTypeRepository.insert(userType1);
        userTypeRepository.insert(userType2);

        //when
        List<UserType> result = userTypeRepository.selectAll();

        //then
        assertThat(result).containsExactly(userType1, userType2);
    }

    @Test
    void selectById() {
        //given
        UserType userType = new UserType("TEST", "테스트용");
        userTypeRepository.insert(userType);

        //when
        UserType result = userTypeRepository.selectById(userType.getId());

        //then
        assertThat(result).isEqualTo(userType);
    }

    @Test
    void selectByName() {
        //given
        UserType userType = new UserType("TEST", "테스트용");
        userTypeRepository.insert(userType);

        //when
        UserType result = userTypeRepository.selectByName(userType.getName());

        //then
        assertThat(result).isEqualTo(userType);
    }
}