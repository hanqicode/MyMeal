package com.qqihan.MyMeal.likes;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBQueryExpression;
import lombok.AllArgsConstructor;
import lombok.NonNull;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@AllArgsConstructor
public class LikesAccessor {

    private final DynamoDBMapper mapper;

    public List<Likes> getAllUserLikesByUsername(@NonNull final String username) {
        final Likes likes = new Likes();
        likes.setUsername(username);

        final DynamoDBQueryExpression<Likes> queryExpression = new DynamoDBQueryExpression<Likes>()
                .withHashKeyValues(likes);

        return mapper.query(Likes.class, queryExpression);
    }

    public boolean likeRestaurant(@NonNull final String username,
                                  @NonNull final String restaurantName) {
        final Likes likes = new Likes();
        likes.setUsername(username);
        likes.setRestaurantName(restaurantName);

        mapper.save(likes);
        return true;
    }
}
