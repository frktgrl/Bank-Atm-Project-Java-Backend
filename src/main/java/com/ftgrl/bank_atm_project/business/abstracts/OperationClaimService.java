package com.ftgrl.bank_atm_project.business.abstracts;

import com.ftgrl.bank_atm_project.entity.OperationClaim;

public interface OperationClaimService {
	
	OperationClaim getClaimByClaimName(String claimName);
	
	OperationClaim getClaimByEmail(String email);
}
