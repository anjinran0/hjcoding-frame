package com.hjcoding.user.service.impl;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hjcoding.user.entity.dto.UserDto;
import com.hjcoding.user.entity.po.UserPo;
import com.hjcoding.user.mapper.UserMapper;
import com.hjcoding.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserMapper userMapper;

    @Override
    public int addUser(UserDto userDto) {
        UserPo userPo = new UserPo();
        BeanUtils.copyProperties(userDto, userPo);
        userPo.setCreateTime(new Date());
        int count = userMapper.insert(userPo);
        return count;
    }
}
