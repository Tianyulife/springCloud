package com.han.springCloud.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author 12092
 * @since 2023-07-02
 */
@Getter
@Setter
@ToString
public class Payment implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private String serial;
}
