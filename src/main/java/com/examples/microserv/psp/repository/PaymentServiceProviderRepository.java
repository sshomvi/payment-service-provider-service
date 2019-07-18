package com.examples.microserv.psp.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.examples.microserv.psp.model.PaymentServiceProvider;

@Repository
public interface PaymentServiceProviderRepository extends JpaRepository<PaymentServiceProvider,Long> {

	@Query("select p from PaymentServiceProvider p where p.pspCode = :pspCode")
	public PaymentServiceProvider findByPspCode(@Param("pspCode") String pspCode);

}
