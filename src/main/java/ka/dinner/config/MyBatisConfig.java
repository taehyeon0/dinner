package ka.dinner.config;

import ka.dinner.mapper.user.UserMapper;
import ka.dinner.mapper.user.UserTypeMapper;
import ka.dinner.repository.user.MyBatisUserRepository;
import ka.dinner.repository.user.MyBatisUserTypeRepository;
import ka.dinner.repository.user.UserRepository;
import ka.dinner.repository.user.UserTypeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class MyBatisConfig {

    private final UserTypeMapper userTypeMapper;
    private final UserMapper userMapper;

    @Bean
    public UserTypeRepository userTypeRepository() {
        return new MyBatisUserTypeRepository(userTypeMapper);
    }

    @Bean
    public UserRepository userRepository() {
        return new MyBatisUserRepository(userMapper);
    }
}
