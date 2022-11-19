package ka.dinner.repository.user;

import ka.dinner.domain.user.User;

import java.util.List;

public interface UserRepository {
    User insert(User user);
    void delete(int id);
    User update(User user);
    User selectById(int id);
    User selectByEmail(String email);
    User selectByEmailAndPassword(String email, String password);
    List<User> selectAll();
}
