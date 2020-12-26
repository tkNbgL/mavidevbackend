package com.example.mavidev.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mavidev.dao.mapper.UserFormMapper;
import com.example.mavidev.dao.model.UserFormDao;
import com.example.mavidev.model.UserForm;
import com.example.mavidev.repository.UserFormRepository;

@Service
public class FormServiceImpl implements FormService{
	@Autowired
	private UserFormRepository userFormRepository;

	@Override
	public List<UserFormDao> getAllForms() {
		// TODO Auto-generated method stub
		List<UserForm> forms = userFormRepository .findAll();
		List<UserFormDao> userFormDao = forms.stream()
				.map(i -> UserFormMapper.toUserFormDao(i)).collect(Collectors.toList());
		return userFormDao;
	}

	@Override
	public UserForm createForm(UserFormDao userFormDao) {
		// TODO Auto-generated method stub
		UserForm newUserForm = UserFormMapper.toUserForm(userFormDao);
		return newUserForm;
	}
	
}
