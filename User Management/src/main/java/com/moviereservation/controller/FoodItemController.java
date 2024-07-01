package com.moviereservation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.moviereservation.Entity.FoodItem;
import com.moviereservation.UserService.FoodItemService;

@RestController
@RequestMapping("/api/fooditems")
public class FoodItemController {
	@Autowired
	private FoodItemService foodItemService;

	@GetMapping
	public ResponseEntity<List<FoodItem>> getAllFoodItems() {
		return ResponseEntity.ok(foodItemService.getAllFoodItems());
	}
}
