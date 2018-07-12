package com.sunru.track.vehicle.model.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.sunru.track.vehicle.model.entity.User;


public interface UserDao extends CrudRepository<User,Long> {
List<User> findByEmail(String email);		

}
