package com.csc3402.lab.projectcsc3402.service;

import com.csc3402.lab.projectcsc3402.dto.UserDto;
import com.csc3402.lab.projectcsc3402.model.Role;
import com.csc3402.lab.projectcsc3402.model.User;
import com.csc3402.lab.projectcsc3402.repository.RoleRepository;
import com.csc3402.lab.projectcsc3402.repository.UserRepository;
import com.csc3402.lab.projectcsc3402.util.TbConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class UserServiceImpl implements UserService {  // Added interface implementation
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public void saveUser(UserDto userDto) {
        Role role = roleRepository.findByName(TbConstants.Roles.USER);

        if (role == null) {
            role = roleRepository.save(new Role(TbConstants.Roles.USER));
        }

        User user = new User(userDto.getName(), userDto.getEmail(), passwordEncoder.encode(userDto.getPassword()), Arrays.asList(role));
        userRepository.save(user);
    }

    @Override
    public User findUserByEmail(String email) {
        return userRepository.findByEmail(email);
    }
}
