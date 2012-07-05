/**
 * 
 */
package com.swg.acs.message.datamodel.object;

import java.io.Serializable;
import java.util.List;

/**
 * @author satriaprayoga
 *
 */
public interface Device extends Serializable{

	String getDeviceSummary();
	int getLANDeviceNumberOfEntries();
	int getWANDeviceNumberOfEntries();
	DeviceInfo getDeviceInfo();
	ManagementServer getManagementServer();
	List<? extends LANDevice> getLanDevices();
	List<? extends WANDevice> getWanDevices();
	String getConfigPassword(); //LANConfigSecurity part of TR-069 Data Model
}
