package com.kiran.sbeans;

import java.util.Date;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component("voter")
@PropertySource("com/kiran/commons/Info.properties")
public class CheckingVotingEligibility 
{
	@Value("${voter.id}")
	private Integer id;
	@Value("${voter.name}")
	private String name;
	@Value("${voter.age}")
	private Integer age;
	
	private Date verifiedOn;
	
	@PostConstruct
	public void myInit()
	{
		System.out.println("CheckingVotingEligibility.myInit()");
		verifiedOn = new Date();
		if(name==null || age<=0) {
			throw new IllegalArgumentException("set correct values to name and age");
		}
	}
	
	public String checkEligibility() {
		System.out.println("CheckingVotingEligibility.checkEligibility()");
		if(age<18)
			return "Mr/Miss/Mrs."+name+" You are not Eligible for voting on "+verifiedOn;
		else
			return "Mr/Miss/Mrs."+name+" You are Eligible for voting on "+verifiedOn;
	}
	
	@PreDestroy
	public void myDestroy()
	{
		System.out.println("CheckingVotingEligibility.myDestroy()");
		name=null;
		age=null;
		verifiedOn = null;
		id = null;
	}
}
