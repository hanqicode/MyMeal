package com.qqihan.MyMeal.dashboard;

import com.qqihan.MyMeal.recommend.RecommendService;
import com.qqihan.MyMeal.restaurant.Restaurant;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class DashboardController {

    private final RecommendService recommendService;

    @GetMapping("/getDashboard")
    public Dashboard getDashboard(@RequestParam(value = "username") String username) {
        return new Dashboard(username);
    }

    @GetMapping("/getRecommendedRestaurant")
    public Restaurant getRecommendedRestaurant(@RequestParam(value = "username") String username) {
        return recommendService.getRecommendedRestaurantFromLikes(username);
    }

    @GetMapping("/saveRestaurant")
    public boolean saveRestaurant(@RequestParam(value = "username") String username,
                                  @RequestParam(value = "restaurant_name") String restaurantName) {
        return true;
    }
}
