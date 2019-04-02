package com.tekharamain.resale.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.tekharamain.resale.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	User findByEmailAndPassword(String email, String password);

	@Query(value ="SELECT DISTINCT u.city \n" +
            "FROM   User u \n"
            )
	List<String> findCity();

}
