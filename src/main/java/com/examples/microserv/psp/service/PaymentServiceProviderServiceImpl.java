package com.examples.microserv.psp.service;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.examples.microserv.psp.model.PaymentServiceProvider;
import com.examples.microserv.psp.repository.PaymentServiceProviderRepository;

@Service
public class PaymentServiceProviderServiceImpl implements PaymentServiceProviderService {

	@Autowired
    private PaymentServiceProviderRepository pspRepository;
 
	private static Logger log = LoggerFactory.getLogger(PaymentServiceProviderServiceImpl.class);

    @Override
	public List<PaymentServiceProvider> getAllPsps() {

		List<PaymentServiceProvider> psps = new ArrayList<>();

		try {
			psps =  pspRepository.findAll();
		} catch (Exception e) {
			log.error("",e);
		}
		
		return psps;  
	}
 
    @Override
    public PaymentServiceProvider createOrSavePsp(PaymentServiceProvider psp) {       
    	try {
    		return pspRepository.save(psp);
		} catch (Exception e) {
			log.error("",e);
		}
    	
    	return psp;   	
    }
 
    @Override
    public PaymentServiceProvider getPspById(Long id) {
        
    	PaymentServiceProvider foundPsp = new PaymentServiceProvider();
        
        try {
        	foundPsp = pspRepository.findById(id).get();
		} catch (Exception e) {
			log.error("",e);
		}
    	
    	return foundPsp;   
    }
    
    @Override
    public PaymentServiceProvider updatePsp(PaymentServiceProvider psp, Long id) {
        return pspRepository.findById(id).map(pspFound -> {  	      	
        	pspFound.setActive(psp.getActive()); 
        	pspFound.setPspCode(psp.getPspCode());
        	pspFound.setPspDescription(psp.getPspDescription());
        	pspFound.setPspShortname(psp.getPspShortname());
            return pspRepository.save(pspFound);           
        }).orElseGet(() -> {
        	psp.setId(id);
            return pspRepository.save(psp);
        });
    }

    @Override
    public Boolean deleteEmployee(Long id) {
    	
    	Boolean isSuccessful = false;

        try {
        	pspRepository.deleteById(id);
        	isSuccessful = true;
		} catch (Exception e) {
			log.error("",e);
		}
    	
    	return isSuccessful;   
   	
    }
    
    @Override
    public PaymentServiceProvider getPspByCode(String pspCode) {
        return pspRepository.findByPspCode(pspCode);
    }
	
}
