package ka.dinner.domain.store;

import lombok.Data;

@Data
public class StoreListByUserView {
    private int storeId;
    private String storeName;
    private String storePhoto;
    private int distance;
    private double reviewScore;

    public StoreListByUserView() {
    }

    public StoreListByUserView(int storeId, String storeName, String storePhoto, int distance, double reviewScore) {
        this.storeId = storeId;
        this.storeName = storeName;
        this.storePhoto = storePhoto;
        this.distance = distance;
        this.reviewScore = reviewScore;
    }
}
