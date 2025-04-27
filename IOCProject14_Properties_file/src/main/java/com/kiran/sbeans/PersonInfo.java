package com.kiran.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component("pinfo")
@PropertySource(value="com/kiran/commons/Info.properties")
public class PersonInfo 
{	
	@Value("${per.id}")
	private Integer pid;
	@Value("${per.name}")
	private String pname;
	@Value("${per.addrs}")
	private String padress;
	
	//Injecting the direct values to spring bean properties
	@Value("9192939495")
	private long mobileno;
	
	//Injecting the system properties value
	@Value("${os.name}")
	private String os_name;
	@Value("${os.version}")
	private String os_ver;
	
	//Injecting  env variable values
	@Value("${Path}")
	private String path_data;
	
	@Override
	public String toString() {
		return "PersonInfo [pid=" + pid + ", pname=" + pname + ", padress=" + padress + ", mobileno=" + mobileno
				+ ", os_name=" + os_name + ", os_ver=" + os_ver + ", path_data=" + path_data + "]";
	}
}
