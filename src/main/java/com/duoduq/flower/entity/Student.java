package com.duoduq.flower.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @Auther: Jack
 * @Date: 2019-07-30 17:42
 * @Description:
 */
@Data
@TableName("student")
public class Student {

    @TableId
    private String oid;

    private String name;

}
