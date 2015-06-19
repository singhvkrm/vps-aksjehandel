package org.vpspoc.mock.vpsbank;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

@Path("bank")
public class MyMockBank {


public boolean fundTransfer(String from_clientId, String to_clientId, int sum) {
		
		return true;
	}

}
