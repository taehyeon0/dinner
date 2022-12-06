package ka.dinner.repository.menu;

import ka.dinner.domain.menu.OfferType;
import ka.dinner.mapper.menu.OfferTypeMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

import java.util.List;

@Slf4j
@Repository
@RequiredArgsConstructor
public class MyBatisOfferTypeRepository implements OfferTypeRepository {

    private final OfferTypeMapper offerTypeMapper;

    @Override
    public OfferType selectById(String id) {
        List<OfferType> list = null;
        list = offerTypeMapper.selectById(id);
        return (list.size() == 0 ? null : list.get(0));
    }

    @Override
    public OfferType selectByName(String name) {
        List<OfferType> list = null;
        list = offerTypeMapper.selectByName(name);
        return (list.size() == 0 ? null : list.get(0));
    }

    @Override
    public List<OfferType> selectAll() {
        List<OfferType> list = null;
        list = offerTypeMapper.selectAll();
        return list;
    }
}
