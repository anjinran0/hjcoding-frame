package com.hjcoding.user.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hjcoding.user.entity.po.UserPo;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper extends BaseMapper<UserPo> {
}
