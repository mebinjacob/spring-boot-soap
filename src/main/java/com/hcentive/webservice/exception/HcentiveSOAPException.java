package com.hcentive.webservice.exception;

import org.springframework.ws.soap.server.endpoint.annotation.FaultCode;
import org.springframework.ws.soap.server.endpoint.annotation.SoapFault;

/**
 * @author Mebin.Jacob
 * @since 09-02-2014
 * 
 */

@SoapFault(faultCode = FaultCode.SERVER)
public final class HcentiveSOAPException extends Exception{
	
	private static final long serialVersionUID = 1L;
	
	public HcentiveSOAPException(String message){
		super(message);
	}
	
}
