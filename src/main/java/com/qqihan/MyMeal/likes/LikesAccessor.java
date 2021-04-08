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

    public List<Likes> getAllUserLikesByUserName(@NonNull final String userName) {
        final Likes likes = new Likes();
        likes.setUserName(userName);

        final DynamoDBQueryExpression<Likes> queryExpression = new DynamoDBQueryExpression<Likes>()
                .withHashKeyValues(likes);

        return mapper.query(Likes.class, queryExpression);
    }
}
