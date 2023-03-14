package com.ftgrl.bank_atm_project.dataAccess;

import com.ftgrl.bank_atm_project.entity.OperationClaim;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface OperationClaimDao extends JpaRepository<OperationClaim, Integer>{

	@Query("From OperationClaim o where o.claimName = :claimName")
	OperationClaim getClaimByClaimName(String claimName);
	
	@Query("From OperationClaim o where o.systemUser.email = :email")
	OperationClaim getClaimByEmail(String email);

}
