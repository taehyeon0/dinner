package ka.dinner.repository.user;

import ka.dinner.domain.user.UserType;

import java.util.List;

public interface UserTypeRepository {
    void insert(UserType userType);
    void delete(String id);
    void update(String id,String name);
    List<UserType> selectAll();
    UserType selectById(String id);
    UserType selectByName(String name);
}
