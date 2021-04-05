package com.qqihan.MyMeal.recommend;

import com.qqihan.MyMeal.restaurant.Restaurant;
import com.qqihan.MyMeal.restaurant.RestaurantService;
import lombok.AllArgsConstructor;
import lombok.NonNull;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
@AllArgsConstructor
public class RecommendService {

    private RestaurantService restaurantService;

    public Restaurant getRecommendedRestaurant(@NonNull final String username) {
        final List<Restaurant> restaurantList = restaurantService.getRestaurantListByUsername(username);
        final Random random = new Random();
        return restaurantList.get(random.nextInt(restaurantList.size()));
    }
}
