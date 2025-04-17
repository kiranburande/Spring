package com.kiran.sbeans;

import org.springframework.stereotype.Component;

@Component("bDart")
public final class BlueDart implements ICourior
{


	public BlueDart() {
		super();
		System.out.println("BlueDart::0-param Constructor");
	}

	@Override
	public String deliver(int oid)
	{

		return "BlueDart Curior is ready to deliver "+oid+" order number products";
	}

}
