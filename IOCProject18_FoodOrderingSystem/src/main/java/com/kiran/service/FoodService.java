package com.kiran.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kiran.sbeans.FoodDetails;

@Service("foodService")
public class FoodService 
{
	@Autowired
	private FoodDetails foodDetails;
	
	public void displayFoodInfo()
	{
		System.out.println("**** Food Details ****");
		System.out.println(foodDetails);
	}
}
