package com.example.mavidev.dao.mapper;

import org.springframework.stereotype.Component;

import com.example.mavidev.dao.model.UserFormDao;
import com.example.mavidev.model.UserForm;

@Component
public class UserFormMapper {
	public static UserFormDao toUserFormDao(UserForm userForm) {
		UserFormDao userFormDao = new UserFormDao(
				userForm.getName(),
				userForm.getMail(),
				userForm.getMessage());
		
		
		return userFormDao;
	}
	
	public static UserForm toUserForm(UserFormDao userFormDao) {
		UserForm userForm = new UserForm(
				userFormDao.getName(),
				userFormDao.getMail(),
				userFormDao.getMessage());
		
		
		return userForm;
	}

}
