package com.ftgrl.bank_atm_project.business.concretes;

import com.ftgrl.bank_atm_project.entity.OperationClaim;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ftgrl.bank_atm_project.business.abstracts.OperationClaimService;
import com.ftgrl.bank_atm_project.dataAccess.OperationClaimDao;

@Service
public class OperationClaimManager implements OperationClaimService {

	private OperationClaimDao operationClaimDao;
	
	@Autowired
	public OperationClaimManager(OperationClaimDao operationClaimDao) {
		this.operationClaimDao = operationClaimDao;
	}
	
	@Override
	public OperationClaim getClaimByClaimName(String claimName) {
		
		return this.operationClaimDao.getClaimByClaimName(claimName);
	}
	
	@Override
	public OperationClaim getClaimByEmail(String email) {
		return this.operationClaimDao.getClaimByEmail(email);
	}

}
