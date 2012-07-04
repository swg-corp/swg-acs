/**
 * 
 */
package com.swg.acs.message.connector;

import java.io.IOException;

import org.apache.http.HttpResponse;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

/**
 * @author satriaprayoga
 *
 */
public class SimpleRequestConnection implements AuthenticatedRequestConnection{

	private String url;
	private int port;
	
	private String username;
	private String password;
	
	public SimpleRequestConnection(String url,int port) {
		this.url=url;
		this.port=port;
	}
	
	@Override
	public int connect(int maxRetry) throws IOException {
		DefaultHttpClient client=new DefaultHttpClient();
		int responseCode=0;
		client.getCredentialsProvider().setCredentials(new AuthScope(url, port), new UsernamePasswordCredentials(username,password));
		try{
			HttpGet httpGet=new HttpGet(url);
			HttpResponse response=client.execute(httpGet);
			responseCode=response.getStatusLine().getStatusCode();
		}finally{
			client.getConnectionManager().shutdown();
		}
		
		return responseCode;
	}
	
	@Override
	public void setUsernamePassword(String username, String password) {
		this.username=username;
		this.password=password;
	}
	
	public String getUrl() {
		return url;
	}
	
	public int getPort() {
		return port;
	}

}
