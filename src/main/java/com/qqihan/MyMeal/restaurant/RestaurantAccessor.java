package com.qqihan.MyMeal.restaurant;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import lombok.AllArgsConstructor;
import lombok.NonNull;
import org.springframework.stereotype.Repository;

@Repository
@AllArgsConstructor
public class RestaurantAccessor {

    private final DynamoDBMapper mapper;

    public Restaurant getRestaurantByRestaurantName(@NonNull final String restaurantName) {
        System.out.println("coming here..");
        Restaurant restaurant = mapper.load(Restaurant.class, restaurantName);
        System.out.println("Item retrieved: " + restaurant);
        return restaurant;
    }
}
