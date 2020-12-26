package com.example.mavidev.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.mavidev.model.UserForm;

@Repository
public interface UserFormRepository extends JpaRepository<UserForm, Integer>{

}
