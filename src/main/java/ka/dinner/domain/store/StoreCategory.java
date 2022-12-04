package ka.dinner.domain.store;

import lombok.Data;

@Data
public class StoreCategory {
    private String id;
    private String name;

    public StoreCategory() {
    }

    public StoreCategory(String id, String name) {
        this.id = id;
        this.name = name;
    }
}
