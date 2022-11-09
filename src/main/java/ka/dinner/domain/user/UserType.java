package ka.dinner.domain.user;

import lombok.Data;

@Data
public class UserType {
    private String id;
    private String name;

    public UserType() {
    }

    public UserType(String id, String name) {
        this.id = id;
        this.name = name;
    }
}
