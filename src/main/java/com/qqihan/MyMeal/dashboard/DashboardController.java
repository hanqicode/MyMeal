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
    public Dashboard getDashboard(@RequestParam(value = "userName") String userName) {
        return new Dashboard(userName);
    }

    @GetMapping("/getRecommendedRestaurant")
    public Restaurant getRecommendedRestaurant(@RequestParam(value = "userName") String userName) {
        return recommendService.getRecommendedRestaurantFromLikes(userName);
    }

    @GetMapping("/saveRestaurant")
    public boolean saveRestaurant(@RequestParam(value = "username") String username,
                                  @RequestParam(value = "restaurantName") String restaurantName) {
        return true;
    }
}
