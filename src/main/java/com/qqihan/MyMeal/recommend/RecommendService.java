package com.qqihan.MyMeal.recommend;

import com.qqihan.MyMeal.likes.Likes;
import com.qqihan.MyMeal.likes.LikesService;
import com.qqihan.MyMeal.restaurant.Restaurant;
import com.qqihan.MyMeal.restaurant.RestaurantService;
import lombok.AllArgsConstructor;
import lombok.NonNull;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

@Service
@AllArgsConstructor
public class RecommendService {

    private final LikesService likesService;
    private final RestaurantService restaurantService;

    public Restaurant getRecommendedRestaurantFromLikes(@NonNull final String username) {
        final List<Likes> likesList = likesService.getAllUserLikesByUsername(username);
        final int index = ThreadLocalRandom.current().nextInt(0, likesList.size());
        final String restaurantName = likesList.get(index).getRestaurantName();
        return restaurantService.getRestaurantByRestaurantName(restaurantName);
    }
}
