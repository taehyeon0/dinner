package ka.dinner.dto.user;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class UserInsertDto {
    private String email;
    private String password;
    private String passwordConfirm;
    private String name;
    private String address;
    private String subAddress;
    private String latitude;
    private String longitude;
    private String phone1;
    private String phone2;
    private String phone3;
    private String type;

    public UserInsertDto() {
    }

    public UserInsertDto(String email, String password, String passwordConfirm, String name, String address, String subAddress, String latitude, String longitude, String phone1, String phone2, String phone3, String type) {
        this.email = email;
        this.password = password;
        this.passwordConfirm = passwordConfirm;
        this.name = name;
        this.address = address;
        this.subAddress = subAddress;
        this.latitude = latitude;
        this.longitude = longitude;
        this.phone1 = phone1;
        this.phone2 = phone2;
        this.phone3 = phone3;
        this.type = type;
    }
}
