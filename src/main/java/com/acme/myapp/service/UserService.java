package com.acme.myapp.service;

import com.acme.myapp.controller.UserController;
import com.acme.myapp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<UserService> getAllUsers() {
        return userRepository.findAll();
    }

   

    public UserService createUser(UserService user) {
        return userRepository.save(user);
    }

  

    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }

	public UserController createUser(UserController user) {
		// TODO Auto-generated method stub
		return null;
	}

	public UserController updateUser(Long id, UserController user) {
		// TODO Auto-generated method stub
		return null;
	}



	public UserService getUserById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}
}
