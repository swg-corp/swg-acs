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
public interface DeviceInfo extends Serializable{

	String getManufacturer();
	String getManufacturerOUI();
	String getModelName();
	String getDescription();
	String getSerialNumber();
	String getHardwareVersion();
	String getSoftwareVersion();
	String getSpecVersion();
	String getProvisioningCode();
	Date getUpTime();
	String getDeviceLog();
}
