/**
 * 
 */
package com.swg.acs.message.datamodel.object;

import java.util.List;

/**
 * @author satriaprayoga
 *
 */
public interface LANDevice {

	LANHostConfigManagement getConfigManagement();
	List<? extends Host> getHosts();
}
