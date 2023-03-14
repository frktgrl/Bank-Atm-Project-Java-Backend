package com.ftgrl.bank_atm_project.business.concretes;

import com.ftgrl.bank_atm_project.entity.SystemUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ftgrl.bank_atm_project.business.abstracts.SystemUserService;
import com.ftgrl.bank_atm_project.dataAccess.SystemUserDao;

@Service
public class SystemUserManager implements SystemUserService {

	private SystemUserDao systemUserDao;
	
	@Autowired
	public SystemUserManager(SystemUserDao systemUserDao) {
		this.systemUserDao = systemUserDao;
	}

	@Override
	public SystemUser getSystemUserByEmail(String email) {
		
		return this.systemUserDao.getSystemUserByEmail(email);
	}
}
