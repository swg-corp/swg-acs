/**
 * 
 */
package com.swg.acs.message.datamodel.object;

import java.io.Serializable;
import java.util.Date;

/**
 * @author satriaprayoga
 *
 */
public interface ManagementServer extends Serializable{

	boolean isEnableCwmp();
	boolean isPeriodicInformEnable();
	int getPeriodicInformInterval();
	Date getPeriodicInformTime();
	boolean isUpgradeManaged();
	String getUrl();
	String getUsername();
	String getPassword();
	String getParameterKey();
	String getConnectionRequestUrl();
	String getConnectionRequestUsername();
	String getConnectionRequestPassword();
}
