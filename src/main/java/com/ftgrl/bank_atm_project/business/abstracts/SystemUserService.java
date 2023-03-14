package com.ftgrl.bank_atm_project.business.abstracts;

import com.ftgrl.bank_atm_project.entity.SystemUser;

public interface SystemUserService {
	
	SystemUser getSystemUserByEmail(String email);
}
