package ka.dinner.domain.menu;

import ka.dinner.domain.store.Store;
import lombok.Data;

import java.sql.Timestamp;

@Data
public class Menu {
    private Store store;
    private int id;
    private OfferType offerType;
    private String Tag;
    private String name;
    private int price;
    private int amount;
    private String description;
    private String notice;
    private String photo;
    private Timestamp removeDate;

    public Menu() {
    }

    public Menu(Store store, int id, OfferType offerType, String tag, String name, int price, int amount, String description, String notice, String photo, Timestamp removeDate) {
        this.store = store;
        this.id = id;
        this.offerType = offerType;
        Tag = tag;
        this.name = name;
        this.price = price;
        this.amount = amount;
        this.description = description;
        this.notice = notice;
        this.photo = photo;
        this.removeDate = removeDate;
    }
}
