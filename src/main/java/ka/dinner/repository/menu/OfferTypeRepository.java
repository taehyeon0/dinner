package ka.dinner.repository.menu;

import ka.dinner.domain.menu.OfferType;

import java.util.List;

public interface OfferTypeRepository {

    OfferType selectById(String id);
    OfferType selectByName(String name);
    List<OfferType> selectAll();
}
