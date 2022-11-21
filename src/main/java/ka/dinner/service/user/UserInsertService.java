package ka.dinner.service.user;

import ka.dinner.domain.user.User;
import ka.dinner.domain.user.UserType;
import ka.dinner.dto.user.UserInsertDto;
import ka.dinner.repository.user.UserRepository;
import ka.dinner.repository.user.UserTypeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class UserInsertService {

    private final UserRepository userRepository;

    private final UserTypeRepository userTypeRepository;

    public User execute(UserInsertDto dto) {
        String type = dto.getType();
        String email = dto.getEmail();
        String password = dto.getPassword();
        String name = dto.getName();
        String address = dto.getAddress();
        String subAddress = dto.getSubAddress();
        String strLatitude = dto.getLatitude();
        String strLongitude = dto.getLongitude();
        String phone = dto.getPhone1() + dto.getPhone2() + dto.getPhone3();
        UserType userType = userTypeRepository.selectById(type);
        double latitude = Double.parseDouble(strLatitude);
        double longitude = Double.parseDouble(strLongitude);

        User user = new User(0, userType, email, password, name, address, subAddress, latitude, longitude, phone, null, null);

        return userRepository.insert(user);
    }
}
