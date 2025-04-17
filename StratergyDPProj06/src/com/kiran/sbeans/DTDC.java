package com.kiran.sbeans;

import org.springframework.stereotype.Component;

@Component("dtdc")
public final class DTDC implements ICourior
{
	public DTDC() {
		super();
		System.out.println("DTDC::0-param constructor");
	}

	@Override
	public String deliver(int oid)
	{
		return "DTDC Curior is ready to deliver "+oid+" order number products";
	}

}
