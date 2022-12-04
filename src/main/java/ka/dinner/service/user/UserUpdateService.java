package ka.dinner.service.user;

import ka.dinner.domain.user.User;
import ka.dinner.dto.user.UserUpdateDto;
import ka.dinner.repository.user.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.servlet.http.HttpSession;

@Slf4j
@Service
@Transactional
@RequiredArgsConstructor
public class UserUpdateService {

    private final UserRepository userRepository;

    public User execute(UserUpdateDto dto, HttpSession session) {
        String name = dto.getName();
        String phone = dto.getPhone1() + dto.getPhone2() + dto.getPhone3();
        String address = dto.getAddress();
        String subAddress = dto.getSubAddress();
        String strLatitude = dto.getLatitude();
        String strLongitude = dto.getLongitude();
        String newPassword = dto.getNewPassword();
        String newPasswordConfirm = dto.getNewPasswordConfirm();

        User loginUser = (User) session.getAttribute("loginUser");
        int loginUserId = loginUser.getId();

        User targetUser = userRepository.selectById(loginUserId);
        targetUser.setName(name);
        targetUser.setPhone(phone);
        targetUser.setAddress(address);
        targetUser.setSubAddress(subAddress);
        double latitude = Double.parseDouble(strLatitude);
        double longitude = Double.parseDouble(strLongitude);
        targetUser.setLatitude(latitude);
        targetUser.setLongitude(longitude);

        targetUser.setPassword(newPassword);

        userRepository.update(targetUser);

        return targetUser;
    }
}
