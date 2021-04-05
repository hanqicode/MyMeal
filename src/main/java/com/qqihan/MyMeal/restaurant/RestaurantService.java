package com.qqihan.MyMeal.restaurant;

import lombok.NonNull;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RestaurantService {

    public List<Restaurant> getRestaurantListByUsername(@NonNull final String username) {
        Restaurant restaurant1 = new Restaurant("spicyCity");
        Restaurant restaurant2 = new Restaurant("happyLemon");
        return List.of(restaurant1, restaurant2);
    }

    public boolean saveRestaurant(@NonNull final String username,
                                  @NonNull final Restaurant restaurant) {
        return true;
    }

    public Restaurant buildRestaurant(@NonNull final String restaurantName) {
        return new Restaurant(restaurantName);
    }
}
