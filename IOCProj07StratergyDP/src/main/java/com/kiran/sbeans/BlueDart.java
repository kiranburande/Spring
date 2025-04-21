package com.kiran.sbeans;

import org.springframework.stereotype.Component;

@Component("bDart")
public class BlueDart implements ICourior
{

	@Override
	public String deliver(int oid) 
	{
		return oid+" order items are kept for delivery by BlueDart";
	}

}
