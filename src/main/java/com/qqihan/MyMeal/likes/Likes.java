package com.qqihan.MyMeal.likes;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBRangeKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@DynamoDBTable(tableName = "Likes")
public class Likes {

    @DynamoDBHashKey(attributeName = "username")
    private String username;

    @DynamoDBRangeKey(attributeName = "restaurantName")
    private String restaurantName;
}
