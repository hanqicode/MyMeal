package com.qqihan.MyMeal.dashboard;

import com.qqihan.MyMeal.recommend.RecommendService;
import com.qqihan.MyMeal.restaurant.Restaurant;
import com.qqihan.MyMeal.restaurant.RestaurantService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class DashboardController {

    private RecommendService recommendService;
    private RestaurantService restaurantService;

    @GetMapping("/getDashboard")
    public Dashboard getDashboard(@RequestParam(value = "username") String username) {
        return new Dashboard(username);
    }

    @GetMapping("/getRecommendedRestaurant")
    public Restaurant getRecommendedRestaurant(@RequestParam(value = "username") String username) {
        return recommendService.getRecommendedRestaurant(username);
    }

    @GetMapping("/saveRestaurant")
    public boolean saveRestaurant(@RequestParam(value = "username") String username,
                                  @RequestParam(value = "restaurantName") String restaurantName) {
        final Restaurant restaurant = restaurantService.buildRestaurant(restaurantName);
        return restaurantService.saveRestaurant(username, restaurant);
    }
}
