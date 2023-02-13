package com.hjcoding.user.controller;

import com.hjcoding.user.entity.dto.UserDto;
import com.hjcoding.user.entity.req.UserReq;
import com.hjcoding.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping()
    public Integer addUser(@RequestBody UserReq userReq) {
        UserDto userDto = new UserDto();
        BeanUtils.copyProperties(userReq, userDto);
        int i = userService.addUser(userDto);
        return i;
    }
}
