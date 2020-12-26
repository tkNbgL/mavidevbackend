package com.example.mavidev.controller;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.example.mavidev.dao.mapper.UserFormMapper;
import com.example.mavidev.dao.model.UserFormDao;
import com.example.mavidev.model.UserForm;
import com.example.mavidev.service.FormService;

@RestController
@CrossOrigin(origins="*")
public class UserFormController {
	@Autowired
	private FormService formService;
	
	@RequestMapping(method = RequestMethod.GET, path="/usersForm")
	public List<UserFormDao> retrieveAllForms(){
		return formService.getAllForms();
	}
	
	@RequestMapping(method = RequestMethod.POST, path="/postForm")
	public ResponseEntity<Object> createform(@RequestBody UserFormDao userFormDao){
		UserForm savedUserForm = formService.createForm(userFormDao);
		
		URI location = ServletUriComponentsBuilder
				.fromCurrentRequest()
				.path("/{id}")
				.buildAndExpand(savedUserForm.getId()).toUri();
		
		return ResponseEntity.created(location).build();
	}
	
}
