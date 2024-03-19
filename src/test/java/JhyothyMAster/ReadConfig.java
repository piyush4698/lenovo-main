package JhyothyMAster;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig {
 
	/*
	 * Properties properties;
	 * 
	 * String path
	 * ="C:\\Users\\piyush.marodkar\\eclipse-workspace\\Maven_Project\\propertyfile.properties";
	 * 
	 * //constructor
	 * 
	 * public void Readconfig() { try { properties =new Properties();
	 * 
	 * FileInputStream fis=new FileInputStream(path); properties.load(fis);
	 * 
	 * } catch (Exception e) { // TODO: handle exception e.printStackTrace(); } }
	 */
	private Properties properties;

    public ReadConfig() {
        properties = new Properties();
        try {
            FileInputStream fis = new FileInputStream("src/test/resources/propertyfile.properties");
            properties.load(fis);
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
	 
	 public String getBrowser()
		{
		 
			String value = properties.getProperty("browser");
			System.out.println("ho gaya hai ... "+value);
			if(value!=null)
				return value;
			else
				throw new RuntimeException("url not specified in property file.");

		}
	 
	 
	
	 public String getBaseUrl() 
	 {
       String value1 = properties.getProperty("baseurl");
      System.out.println("jkbhjvhjv");
	 
			if(value1!=null)
				return value1;
			else
				throw new RuntimeException("url not specified in property file.");
	 }
  
	
		
		public String getEmail()
		{
			String USN = properties.getProperty("USN");
			if(USN!=null)	
				return USN;	
			else
				throw new RuntimeException("email not specified in property file.");
			
		}
		
		public String getPassword()
		{
			String PASW = properties.getProperty("PASW");
			if(PASW!=null)
				return PASW;
			else
				throw new RuntimeException("password not specified in property file.");
			
		}

}
