package com.kiran.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component("foodDetails")
@PropertySource(value = "com/kiran/commons/food.properties")
@Data
public class FoodDetails 
{
	@Value("${food.id}")
	private int foodId;
	
	@Value("${food.name}")
	private String foodName;
	
	@Value("${food.preparationTime}")
	private int preparationTime;
	
	@Value("${restaurant.name}")
	private String restaurantName;
	
	
}
