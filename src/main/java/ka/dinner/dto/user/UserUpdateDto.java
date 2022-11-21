package ka.dinner.dto.user;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserUpdateDto {
    private String name;
    private String phone1;
    private String phone2;
    private String phone3;
    private String address;
    private String subAddress;
    private String latitude;
    private String longitude;
    private String newPassword;
    private String newPasswordConfirm;

    public UserUpdateDto() {
    }

    public UserUpdateDto(String name, String phone1, String phone2, String phone3, String address, String subAddress, String latitude, String longitude, String newPassword, String newPasswordConfirm) {
        this.name = name;
        this.phone1 = phone1;
        this.phone2 = phone2;
        this.phone3 = phone3;
        this.address = address;
        this.subAddress = subAddress;
        this.latitude = latitude;
        this.longitude = longitude;
        this.newPassword = newPassword;
        this.newPasswordConfirm = newPasswordConfirm;
    }
}
