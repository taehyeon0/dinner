package ka.dinner.mapper.user;

import ka.dinner.domain.user.User;
import ka.dinner.domain.user.UserType;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UserMapper {
    void insert(@Param("user") User user, @Param("type") UserType userType);
    void delete(@Param("id") int id, @Param("now") String now);
    User update(User user);
    User selectById(int id);
    User selectByEmail(String email);
    User selectByEmailAndPassword(@Param("email") String email, @Param("password") String password);
    List<User> selectAll();
}
