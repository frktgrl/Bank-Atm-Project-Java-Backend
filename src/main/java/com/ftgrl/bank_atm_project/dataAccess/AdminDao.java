package com.ftgrl.bank_atm_project.dataAccess;

import com.ftgrl.bank_atm_project.entity.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminDao extends JpaRepository<Admin, Integer>{

}
