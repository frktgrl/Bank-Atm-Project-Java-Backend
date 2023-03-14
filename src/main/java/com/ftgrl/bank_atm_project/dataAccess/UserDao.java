package com.ftgrl.bank_atm_project.dataAccess;

import com.ftgrl.bank_atm_project.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserDao extends JpaRepository<User, Integer>{

	@Query("From User u where u.acountNumber = :acountNumber")
	User getUserByAcoountNumber(String acountNumber);
}
