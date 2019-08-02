package com.liqian.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class User extends Page {
    private Integer userId;

    private String userName;

    private String password;

    private String mobile;

    private String wechat;

    private Integer departmentId;

    private Integer companyId;// 公司id

    private Integer groupId;// 组id

    private Integer postId;

    private Integer roleId;

    private Byte isDel;

    private String orgPath;

    private Integer level;

    private List<String> dataOrgNos;


}