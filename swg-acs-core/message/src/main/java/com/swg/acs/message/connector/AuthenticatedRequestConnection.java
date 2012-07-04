/**
 * 
 */
package com.swg.acs.message.connector;

/**
 * Interface untuk melakukan connection request ke CPE, dengan tambahan authentication
 * @author satriaprayoga
 *
 */
public interface AuthenticatedRequestConnection extends RequestConnection{

	/**
	 * Setting username dan password untuk otentikasi ke cpe
	 * @param username
	 * @param password
	 */
	void setUsernamePassword(String username,String password);
}
