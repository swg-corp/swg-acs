/**
 * 
 */
package com.swg.acs.message.connector;

import java.io.IOException;

/**
 * Interface untuk melakukan connection request ke CPE
 * @author satriaprayoga
 *
 */
public interface RequestConnection {

	public final static int OK_CODE=200;
	public final static int NO_CONTENT=204;
	
	/**
	 * Method koneksi ke cpe
	 * @param maxRetry banyaknya usaha melakukan koneksi ke cpe
	 * @return
	 * @throws IOException
	 */
	int connect(int maxRetry)throws IOException;
}
