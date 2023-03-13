package com.rays.common;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * Handles application propagated exceptions
 * 
 * @author Nitesh Vishwakarma
 *
 */
@ControllerAdvice
public class ApplicationExceptionHandlerCtl {
	
	@ExceptionHandler(value = RuntimeException.class)
	public ORSResponse handleRuntimeException(RuntimeException e){
		ORSResponse res = new ORSResponse(false);
		res.addMessage(e.getMessage()+"Jayati Chouhan");
		return res;
	}

}
