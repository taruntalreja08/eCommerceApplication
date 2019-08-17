/**
 * 
 */
package com.example.demo.security;

/**
 * The Class AuthProperties.
 *
 * @author Tarun
 */
public class AuthProperties {

	/**
	 * Instantiates a new auth properties.
	 */
	private AuthProperties() {

	}

	/** The Constant SECRET. */
	public static final String SECRET = "GenerateToken";
	
	/** The Constant EXPIRATION_TIME. */
	public static final long EXPIRATION_TIME = 864_000_000; // 10 days
	
	/** The Constant TOKEN_PREFIX. */
	public static final String TOKEN_PREFIX = "Bearer ";
	
	/** The Constant HEADER_STRING. */
	public static final String HEADER_STRING = "Authorization";

}
