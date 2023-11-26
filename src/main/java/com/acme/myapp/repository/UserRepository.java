package com.acme.myapp.repository;

import com.acme.myapp.service.UserService;
import com.organisation.crudrestfull.dao.JpaRepository;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserRepository, Long> {

	List<UserService> findAll();

	Object findById(Long id);

	UserService save(UserService user);

	void deleteById(Long id);
}
