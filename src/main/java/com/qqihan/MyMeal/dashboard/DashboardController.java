package com.qqihan.MyMeal.dashboard;

import com.qqihan.MyMeal.likes.LikesService;
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

    private final RecommendService recommendService;
    private final RestaurantService restaurantService;
    private final LikesService likesService;

    @GetMapping("/getDashboard")
    public Dashboard getDashboard(@RequestParam(value = "username") String username) {
        return new Dashboard(username);
    }

    @GetMapping("/getRecommendedRestaurant")
    public Restaurant getRecommendedRestaurant(@RequestParam(value = "username") String username) {
        return recommendService.getRecommendedRestaurantFromLikes(username);
    }

    @GetMapping("/likeRestaurant")
    public boolean likeRestaurant(@RequestParam(value = "username") String username,
                                  @RequestParam(value = "restaurant_name") String restaurantName) {
        final Restaurant restaurant = restaurantService.getRestaurantByRestaurantName(restaurantName);

        if (restaurant == null) {
            System.out.println("[likeRestaurant] restaurantName doesn't exist.");
            return false;
        }

        return likesService.likeRestaurant(username, restaurantName);
    }
}
