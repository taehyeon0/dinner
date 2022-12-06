package ka.dinner.mapper.menu;

import ka.dinner.domain.menu.OfferType;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface OfferTypeMapper {
    List<OfferType> selectById(String id);
    List<OfferType> selectByName(String name);
    List<OfferType> selectAll();
}
