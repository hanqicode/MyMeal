package com.qqihan.MyMeal.recommend;

import com.qqihan.MyMeal.restaurant.Restaurant;
import com.qqihan.MyMeal.restaurant.RestaurantService;
import lombok.AllArgsConstructor;
import lombok.NonNull;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class RecommendService {

    private final RestaurantService restaurantService;

    public Restaurant getRecommendedRestaurantFromLikes(@NonNull final String username) {
        // TODO: get restaurant name list from UserLikes table;
        // TODO: get restaurant entities from RestaurantService;
        return null;
    }
}
