package com.example.mavidev.service;

import java.util.List;

import com.example.mavidev.dao.model.UserFormDao;
import com.example.mavidev.model.UserForm;

public interface FormService {
	List<UserFormDao> getAllForms();
	
	UserForm createForm(UserFormDao userFormDao);
}
