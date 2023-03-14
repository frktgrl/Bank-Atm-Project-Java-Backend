package com.ftgrl.bank_atm_project.dataAccess;

import com.ftgrl.bank_atm_project.entity.SystemUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface SystemUserDao extends JpaRepository<SystemUser, Integer>{

	@Query("From SystemUser s where s.email = :email")
	SystemUser getSystemUserByEmail(String email);
}
