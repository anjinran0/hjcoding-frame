package com.hjcoding.user.entity.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

@TableName("user")
@Data
public class UserPo {
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    @TableField("name")
    private String name;
    @TableField("age")
    private Integer age;
    @TableField("create_by")
    private String createBy;
    @TableField("create_time")
    private Date createTime;
    @TableField("update_by")
    private String updateBy;
    @TableField("update_time")
    private Date updateTime;
    @TableField("delete_flag")
    private Integer deleteFlag;
    @TableField("version")
    private Integer version;
}
