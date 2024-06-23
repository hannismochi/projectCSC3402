package com.csc3402.lab.projectcsc3402.service;

import com.csc3402.lab.projectcsc3402.dto.UserDto;
import com.csc3402.lab.projectcsc3402.model.User;

public interface UserService {
    void saveUser(UserDto userDto);
    User findUserByEmail(String email);
}
