package com.han.springCloud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @version 1.0
 * @Auther: 12092
 * @Date: 7/2/2023 01:14
 * @Description: com.han.springCloud.entity
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult <T> implements Serializable {

    private Integer code ;
    private String message;
    private T data;

    public CommonResult(Integer code,String message){
        this(code,message,null);
    }


}
