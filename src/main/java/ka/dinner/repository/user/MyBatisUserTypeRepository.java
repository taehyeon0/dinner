package ka.dinner.repository.user;

import ka.dinner.domain.user.UserType;
import ka.dinner.mapper.user.UserTypeMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

import java.util.List;

@Slf4j
@Repository
@RequiredArgsConstructor
public class MyBatisUserTypeRepository implements UserTypeRepository {

    private final UserTypeMapper userTypeMapper;

    @Override
    public void insert(UserType userType) {
        userTypeMapper.insert(userType);
    }

    @Override
    public void delete(String id) {
        userTypeMapper.delete(id);
    }

    @Override
    public void update(String id, String name) {
        userTypeMapper.update(id, name);
    }

    @Override
    public List<UserType> selectAll() {
        return userTypeMapper.selectAll();
    }

    @Override
    public UserType selectById(String id) {
        return userTypeMapper.selectById(id);
    }

    @Override
    public UserType selectByName(String name) {
        return userTypeMapper.selectByName(name);
    }
}
