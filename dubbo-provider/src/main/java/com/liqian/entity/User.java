package com.liqian.entity;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@Getter
@Setter
public class User implements Serializable{
    private Integer userId;

    private String userName;

    private String password;

}