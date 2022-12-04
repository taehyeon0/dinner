package ka.dinner.service.user;

import ka.dinner.domain.user.User;
import ka.dinner.domain.user.UserType;
import ka.dinner.dto.user.UserInsertDto;
import ka.dinner.repository.user.UserTypeRepository;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import static org.assertj.core.api.Assertions.assertThat;

@Slf4j
@Transactional
@SpringBootTest
class UserInsertServiceTest {

    @Autowired
    UserTypeRepository userTypeRepository;

    @Autowired
    UserInsertService userInsertService;

    @Test
    void execute() {
        //given
        UserType type = new UserType("TEST", "테스트용");
        userTypeRepository.insert(type);
        UserInsertDto dto = new UserInsertDto("test@naver.com", "test", "test", "테스트", "testAddress1","testAddress2", "35", "127", "010", "0000", "0000", "TEST");

        //when
        User user = userInsertService.execute(dto);

        //then
        assertThat(user.getEmail()).isEqualTo(dto.getEmail());
    }
}