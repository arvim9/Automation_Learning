package Day41;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collection;
import java.util.Properties;
import java.util.Set;

public class ReadingPropertiesFile {

	public static void main(String[] args) throws IOException {

		//1) Get location of the properties file.
		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\testdata\\config.properties");
		
		//2) load the file in property object.
		Properties propobj = new Properties();
		propobj.load(file);
		
		String url = propobj.getProperty("appurl");
		String email = propobj.getProperty("email");
		String pass = propobj.getProperty("password");
		String odr_id = propobj.getProperty("order_id");
		String cu_id = propobj.getProperty("cust_id");
		
		System.out.println("URL: - "+url +", "+email+" ,"+pass+" ,"+odr_id+", "+cu_id);		

		
		// Reading all the keys from the properties file.
		
		Set<String> keys = propobj.stringPropertyNames();
		System.out.println(keys);
		
		Set<Object> keyss = propobj.keySet();
		System.out.println(keyss);
		
		// Reading all the values from properties file.
		
		Collection<Object> keysss =  propobj.values();
		System.out.println(keysss);
		
		file.close();
	}

}
