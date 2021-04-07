package com.qqihan.MyMeal.restaurant;

import lombok.AllArgsConstructor;
import lombok.NonNull;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class RestaurantService {

    private final RestaurantAccessor accessor;

    public Restaurant getRestaurantByRestaurantName(@NonNull final String restaurantName) {
        return accessor.getRestaurantByRestaurantName(restaurantName);
    }
}
