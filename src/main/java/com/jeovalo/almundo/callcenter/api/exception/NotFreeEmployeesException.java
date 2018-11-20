package com.jeovalo.almundo.callcenter.api.exception;

/**
 * Almundo CallCenter
 * for HTTP 400 errors
 */
public class NotFreeEmployeesException extends RuntimeException {	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8866484021939618274L;

	/**
	 * Constructor por defecto 
	 */
    public NotFreeEmployeesException() {
        super();
    }

    /**
     * 
     * @param message
     * @param cause
     */
    public NotFreeEmployeesException(final String message, final Throwable cause) {
        super(message, cause);
    }

    /**
     * 
     * @param message
     */
    public NotFreeEmployeesException(final String message) {
        super(message);
    }

    /**
     * 
     * @param cause
     */
    public NotFreeEmployeesException(final Throwable cause) {
        super(cause);
    }

}
