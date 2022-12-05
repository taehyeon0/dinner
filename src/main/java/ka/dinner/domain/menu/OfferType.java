package ka.dinner.domain.menu;

import lombok.Data;

@Data
public class OfferType {
    private String id;
    private String name;

    public OfferType() {
    }

    public OfferType(String id, String name) {
        this.id = id;
        this.name = name;
    }
}
