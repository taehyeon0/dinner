package ka.dinner.domain.store;

import ka.dinner.domain.user.User;
import lombok.Data;

@Data
public class Store {
    private int id;
    private User user;
    private StoreCategory category;
    private StoreState state;
    private String businessNumber;
    private String name;
    private String address;
    private String subAddress;
    private double latitude;
    private double longitude;
    private String phone;
    private String operateTime;
    private String photo;
    private String introduction;
    private OpenState openState;
    private String payNumber;

    public Store() {
    }

    public Store(int id, User user, StoreCategory category, StoreState state, String businessNumber, String name, String address, String subAddress, double latitude, double longitude, String phone, String operateTime, String photo, String introduction, OpenState openState, String payNumber) {
        this.id = id;
        this.user = user;
        this.category = category;
        this.state = state;
        this.businessNumber = businessNumber;
        this.name = name;
        this.address = address;
        this.subAddress = subAddress;
        this.latitude = latitude;
        this.longitude = longitude;
        this.phone = phone;
        this.operateTime = operateTime;
        this.photo = photo;
        this.introduction = introduction;
        this.openState = openState;
        this.payNumber = payNumber;
    }
}
