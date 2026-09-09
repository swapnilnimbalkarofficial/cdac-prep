package collection_framework;

import java.util.Enumeration;
import java.util.Properties;

public class PropertiesExampleMain {

	public static void main(String[] args) {
		//This Program prints system properties
		Properties sysProps=System.getProperties();
		Enumeration propNames= sysProps.propertyNames();
		while(propNames.hasMoreElements()) {
			String propName=(String)propNames.nextElement();
			String propeVal=sysProps.getProperty(propName);
			System.out.println("Name: "+propName+ " Value: "+propeVal);
		}
		
	}

}

