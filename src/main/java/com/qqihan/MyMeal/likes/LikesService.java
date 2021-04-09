package com.qqihan.MyMeal.likes;

import lombok.AllArgsConstructor;
import lombok.NonNull;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class LikesService {

    private final LikesAccessor accessor;

    public List<Likes> getAllUserLikesByUsername(@NonNull final String username) {
        return accessor.getAllUserLikesByUsername(username);
    }

    public boolean likeRestaurant(@NonNull final String username,
                                  @NonNull final String restaurantName) {
        return accessor.likeRestaurant(username, restaurantName);
    }
}
