package com.travel.serviceImpi;

import java.util.Optional;

//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.stereotype.Service;
//
//import com.travel.dto.LoginCredentialsDto;
//import com.travel.dto.LoginDto;
//import com.travel.entity.LoginCredentials;
//import com.travel.entity.LoginMessage;
//import com.travel.repository.LoginCredentialsRepository;
//import com.travel.service.LoginCredentialsService;

//@Service
//public class LoginCredentialsServiceImpi implements LoginCredentialsService {
//	
//	@Autowired
//    private LoginCredentialsRepository lcRepo;
//
//    @Autowired
//    private PasswordEncoder passwordEncoder;
//
//
//    @Override
//    public String addUser(LoginCredentialsDto lcDto) {
//
//        LoginCredentials lc = new LoginCredentials(
//
//        		lcDto.getUserId(),
//        		lcDto.getName(),
//        		lcDto.getEmail(),
//        		lcDto.getPassword(),
//
//               this.passwordEncoder.encode(lcDto.getPassword())
//        );
//
//        lcRepo.save(lc);
//
//        return lc.getName();
//    }
//    LoginCredentialsDto lcDto;
//
//    @Override
//    public LoginMessage loginUser(LoginDto lDto) {
//        //String msg = "";
//        LoginCredentials lc1 = lcRepo.findByUserName(lDto.getUserName());
//        if (lc1 != null) {
//            String password = lDto.getPassword();
//            String encodedPassword = lc1.getPassword();
//            Boolean isPwdRight = passwordEncoder.matches(password, encodedPassword);
//            if (isPwdRight) {
//                Optional<LoginCredentials> lc = lcRepo.findOneByUserNameAndPassword(lcDto.getUserName(), encodedPassword);
//                if (lc.isPresent()) {
//                    return new LoginMessage("Login Success", true);
//                } else {
//                    return new LoginMessage("Login Failed", false);
//                }
//            } else {
//
//                return new LoginMessage("password Not Match", false);
//            }
//        }else {
//            return new LoginMessage("Email not exits", false);
//        }
//    }
//}
