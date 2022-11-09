package ka.dinner.mapper.user;

import ka.dinner.domain.user.UserType;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserTypeMapper {
    void insert(UserType userType);
    void delete(String id);
    void update(String id,String name);
    List<UserType> selectAll();
    UserType selectById(String id);
    UserType selectByName(String name);
}
