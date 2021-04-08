package com.qqihan.MyMeal.user;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import lombok.AllArgsConstructor;
import lombok.NonNull;
import org.springframework.stereotype.Repository;

@Repository
@AllArgsConstructor
public class UserAccessor {

    private final DynamoDBMapper mapper;

    public User getUserByUsername(@NonNull final String username) {
        return mapper.load(User.class, username);
    }
}
