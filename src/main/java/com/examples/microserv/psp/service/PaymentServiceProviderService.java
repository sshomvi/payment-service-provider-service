package com.examples.microserv.psp.service;


import java.util.List;

import com.examples.microserv.psp.model.PaymentServiceProvider;

public interface PaymentServiceProviderService {

	public List<PaymentServiceProvider> getAllPsps();

	public PaymentServiceProvider createOrSavePsp(PaymentServiceProvider psp);

	public PaymentServiceProvider getPspById(Long id);

	public Boolean deleteEmployee(Long id);

	public PaymentServiceProvider updatePsp(PaymentServiceProvider psp, Long id);

	public PaymentServiceProvider getPspByCode(String pspCode);

}
