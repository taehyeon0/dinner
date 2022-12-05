package ka.dinner.repository.store;

import ka.dinner.domain.menu.Menu;
import ka.dinner.domain.store.OpenState;
import ka.dinner.domain.store.Store;
import ka.dinner.domain.store.StoreListByUserView;
import ka.dinner.domain.user.User;

import java.util.List;

public interface StoreRepository {
    int insert(Store store);
    void deleteByStore(int id);
    void deleteByManager(int storeId, User manager, String content);
    int update(Store store);
    void switchOpenState(int storeId, OpenState openState);
    Store selectById(int id);
    Store selectByUserId(int userId);
    List<Store> selectByCategoryName(String categoryName,double userLatitude, double userLongitude, int page, int pageSize);
    List<Store> selectByCategoryNameOnMap(String categoryName,double userLatitude, double userLongitude);
    List<Store> selectByStateName(String stateName, int page, int pageSize);
    List<Store> selectByStateNameAndName(String stateName,String name,int page,int pageSize);
    Store selectByBusinessNumber(String businessNumber);
    List<Store> selectByName(String name,double userLatitude, double userLongitude, int page, int pageSize);
    List<Store> selectByLocation(double userLatitude, double userLongitude);
    List<Store> selectByOpenState(OpenState openState, int page, int pageSize);
    List<Store> selectAll(int page,int pageSize);
    List<StoreListByUserView> selectViewByCategoryName(String categoryName, double userLatitude, double userLongitude, int page, int pageSize);
    List<StoreListByUserView> selectViewByStoreNameOrMenuName(String keyword, double userLatitude, double userLongitude,int page, int pageSize);
    List<Menu> getMenus(int storeId);
    void approve(int storeId, User manager);
    void block(int storeId, User manager, String content);
    void reject(int storeId, User manager, String content);
    int getTotalCount(String stateName,String name);
    int getTotalCountByCategoryName(String categoryName, double userLatitude, double userLongitude, int page, int pageSize);
    int getTotalCountByStoreNameOrMenuName(String keyword, double userLatitude, double userLongitude, int page, int pageSize);
}
