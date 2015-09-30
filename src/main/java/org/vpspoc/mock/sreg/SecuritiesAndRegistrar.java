package org.vpspoc.mock.sreg;

public class SecuritiesAndRegistrar {
	/***
	 * validateSecuritiesOwnership(return validationCode)
	 * updateOwnership(return ack_code)
	 */
	
	boolean resutl;

	public boolean validateOwnership(String clientid, String shareId, int count) {
		
			return true;
	}
	
	public boolean updateOwnership(String from_clientId, String to_clientID, String settlementCode ) {
		
		return true;
		
	}
	
	public boolean issueAksjebrev() {
		
		//Aksjebrev.createCertificate();
		
		return true;
		
	}
		

}
