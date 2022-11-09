package ka.dinner.domain.user;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class User {
    private int id;
    private UserType type;
    private String email;
    private String password;
    private String name;
    private String address;
    private String subAddress;
    private double latitude;
    private double longitude;
    private String phone;
    private Timestamp registerDate;
    private Timestamp removeDate;

    public User() {
    }

    public User(int id, UserType type, String email, String password, String name, String address, String subAddress, double latitude, double longitude, String phone, Timestamp registerDate, Timestamp removeDate) {
        this.id = id;
        this.type = type;
        this.email = email;
        this.password = password;
        this.name = name;
        this.address = address;
        this.subAddress = subAddress;
        this.latitude = latitude;
        this.longitude = longitude;
        this.phone = phone;
        this.registerDate = registerDate;
        this.removeDate = removeDate;
    }
}
