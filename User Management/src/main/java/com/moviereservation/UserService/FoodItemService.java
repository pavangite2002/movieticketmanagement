package com.moviereservation.UserService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.moviereservation.Entity.FoodItem;
import com.moviereservation.repository.FoodItemRepository;

@Service
public class FoodItemService {
	@Autowired
	private FoodItemRepository foodItemRepository;

	public List<FoodItem> getAllFoodItems() {
		return foodItemRepository.findAll();
	}
}
