package ka.dinner.domain.store;

import ka.dinner.domain.user.User;
import lombok.Data;

@Data
public class StoreWithDistance {
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
    private String introduction;
    private OpenState openState;
    private String payNUmber;
    private double distance;

    public StoreWithDistance() {
    }

    public StoreWithDistance(int id, User user, StoreCategory category, StoreState state, String businessNumber, String name, String address, String subAddress, double latitude, double longitude, String phone, String introduction, OpenState openState, String payNUmber, double distance) {
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
        this.introduction = introduction;
        this.openState = openState;
        this.payNUmber = payNUmber;
        this.distance = distance;
    }
}
