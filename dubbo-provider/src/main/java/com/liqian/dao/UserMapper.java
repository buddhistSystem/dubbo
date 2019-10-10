package com.liqian.dao;

import com.liqian.entity.User;

import java.util.List;

public interface UserMapper {

	int countUser();

	List<User> listUser();

}