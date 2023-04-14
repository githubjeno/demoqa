package com.helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;



public class Configuration_Reader {
	public static Properties  prop;
	public Configuration_Reader() throws IOException {
	  File propfile = new File("C:\\Users\\ashin\\eclipse-workspace\\demoqa\\src\\test\\java\\com\\helper\\demoqa.properties");
	  FileInputStream fis = new FileInputStream(propfile);
	   prop= new Properties();
	  prop.load(fis);
}
	public String geturl()
	{
	    String property = prop.getProperty("url");
	    return property;
	}
	public  String getfirstname()
	{
		 String property = prop.getProperty("firstname");
		return property;
	}
	public  String getlastname() {
		String property = prop.getProperty("lastname");
		return property;
	}
	public String getbrowsername() {
		String property = prop.getProperty("browser");
		return property;
	}
}
