package ka.dinner.domain.store;

import lombok.Data;

@Data
public class StoreState {
    private int id;
    private String name;

    public StoreState() {
    }

    public StoreState(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
