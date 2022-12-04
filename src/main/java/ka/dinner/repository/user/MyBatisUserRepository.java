package ka.dinner.repository.user;

import ka.dinner.domain.user.User;
import ka.dinner.domain.user.UserType;
import ka.dinner.mapper.user.UserMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

@Slf4j
@Repository
@RequiredArgsConstructor
public class MyBatisUserRepository implements UserRepository{

    private final UserMapper userMapper;

    @Override
    public User insert(User user) {
        UserType type = user.getType();
        userMapper.insert(user, type);
        return user;
    }

    @Override
    public void delete(int id) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Calendar calendar = Calendar.getInstance();
        String now = sdf.format(calendar.getTime());
        log.info("now={}", now);
        userMapper.delete(id, now);
    }

    @Override
    public User update(User user) {
        userMapper.update(user);
        return user;
    }

    @Override
    public User selectById(int id) {
        return userMapper.selectById(id);
    }

    @Override
    public User selectByEmail(String email) {
        return userMapper.selectByEmail(email);
    }

    @Override
    public User selectByEmailAndPassword(String email, String password) {
        return userMapper.selectByEmailAndPassword(email, password);
    }

    @Override
    public List<User> selectAll() {
        return userMapper.selectAll();
    }
}
