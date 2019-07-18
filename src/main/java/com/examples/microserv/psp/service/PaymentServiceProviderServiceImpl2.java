//package com.examples.microserv.psp.service;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Optional;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import com.examples.microserv.psp.model.PaymentServiceProvider;
//import com.examples.microserv.psp.repository.PaymentServiceProviderRepository;
//import com.examples.microserv.psp.service.util.CustomCode;
//import com.examples.microserv.psp.service.util.CustomResponse;
//
//@Service
//public class PaymentServiceProviderServiceImpl2  {
//
//	@Autowired
//    private PaymentServiceProviderRepository pspRepository;
// 
//	private static Logger log = LoggerFactory.getLogger(PaymentServiceProviderServiceImpl2.class);
//	
//	private static Long responseCode;
//	
//    
//	public CustomResponse getAllPsps() {
//
//		List<PaymentServiceProvider> psps = new ArrayList<>();
//
//		try {
//			psps =  pspRepository.findAll();
//			responseCode = CustomCode.SUCCESS.getCode();
//		} catch (Exception e) {
//			log.error("",e);	
//			responseCode = CustomCode.ERRORONPROCESSINGREQUEST.getCode();
//		}	 
//		
//		return new CustomResponse(psps,responseCode);
//	}
// 
//    
//    public CustomResponse createOrSavePsp(PaymentServiceProvider psp) {       
//    	try {
//    		pspRepository.save(psp);
//    		responseCode = CustomCode.SUCCESS.getCode();
//		} catch (Exception e) {
//			log.error("",e);
//			responseCode = CustomCode.ERRORONPROCESSINGREQUEST.getCode();
//		}
//    	
//		return new CustomResponse(psp,responseCode);
//    }
// 
//    
//    public CustomResponse getPspById(Long id) {
//        
//    	PaymentServiceProvider foundPsp = new PaymentServiceProvider();
//        
//        try {
//        	foundPsp = pspRepository.findById(id).get();
//        	responseCode = CustomCode.SUCCESS.getCode();
//		} catch (Exception e) {
//			log.error("",e);
//			responseCode = CustomCode.ERRORONPROCESSINGREQUEST.getCode();
//		}
//    	
//        return new CustomResponse(foundPsp,responseCode);
//    }
//    
//    
//	public CustomResponse updatePsp(PaymentServiceProvider psp, Long id) {
//
//		Optional<PaymentServiceProvider> pspFound = pspRepository.findById(id);
//
//		try {
//			if (pspFound.isPresent()) {
//				pspFound.get().setActive(psp.getActive());
//				pspFound.get().setPspCode(psp.getPspCode());
//				pspFound.get().setPspDescription(psp.getPspDescription());
//				pspFound.get().setPspShortname(psp.getPspShortname());
//				psp = pspRepository.save(pspFound.get());
//				responseCode = CustomCode.SUCCESS.getCode();
//			} else {
//				responseCode = CustomCode.RECORDNOTFOUND.getCode();
//			}
//
//		} catch (Exception e) {
//			log.error("", e);
//			responseCode = CustomCode.ERRORONPROCESSINGREQUEST.getCode();
//		}
//
//		 return new CustomResponse(psp,responseCode);
//	}
//
//    
//    public CustomResponse deleteEmployee(Long id) {
//
//    	try {
//    		pspRepository.deleteById(id);
//    		responseCode = CustomCode.SUCCESS.getCode();
//		} catch (Exception e) {
//			log.error("", e);
//			responseCode = CustomCode.ERRORONPROCESSINGREQUEST.getCode();
//		}
//    	  	
//    	return new CustomResponse(id,responseCode);
//   	
//    }
//    
//    
//    public CustomResponse getPspByCode(String pspCode) {
//       
//    	Optional<PaymentServiceProvider> pspFound = (Optional<PaymentServiceProvider>) pspRepository.findByPspCode(pspCode);
//    	
//    	try {
//    		if (pspFound.isPresent()) {
//    			responseCode = CustomCode.SUCCESS.getCode();
//    		} else {
//    			responseCode = CustomCode.RECORDNOTFOUND.getCode();
//    		}
//		} catch (Exception e) {
//			log.error("", e);
//			responseCode = CustomCode.ERRORONPROCESSINGREQUEST.getCode();
//		}
// 	
//    	return new CustomResponse(pspFound.get(),responseCode);
//    }
//	
//}
