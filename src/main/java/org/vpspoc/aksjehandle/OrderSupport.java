package org.vpspoc.aksjehandle;


import org.apache.camel.language.NamespacePrefix;
import org.apache.camel.language.XPath;

/**
 * This class contains business logic that determines the region for a type. It is used by the Camel route in this example.
 */
public class OrderSupport {

    public static final String buy = "buy";
    public static final String sell = "sell";
    public static final String unknown = "unknown";
  

    /**
     * Get the order type code.
     * 
     * This method can be used as a plain Java method. However, when it is used inside a Camel route, the @XPath annotation will
     * evaluate the XPath expression and use the result as the method parameter. In this case, it will fetch the type code
     * from the order XML message. So, the method will determine the region code for the type that is in the XML message.
     * 
     * @param order code
     * @return order Type
     */
    public String getOrderType(@XPath(value = "/order:order/order:type",
        namespaces = @NamespacePrefix(prefix = "order", uri = "http://vpsdemo.no/order/v1")) String type) {
    	if (buy.equals("buy")) {
            return buy;
        }	 else if (sell.equals("sell")) {
            return sell;
        } else {
            return unknown;
        }
    }

	
        
}