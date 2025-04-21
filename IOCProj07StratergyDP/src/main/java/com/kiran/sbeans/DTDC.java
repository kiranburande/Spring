package com.kiran.sbeans;

import org.springframework.stereotype.Component;

@Component("dtdc")
public class DTDC implements ICourior
{
	@Override
	public String deliver(int oid) {
	
		return oid+" order items are kept for delivery by DTDC";
	}

}
