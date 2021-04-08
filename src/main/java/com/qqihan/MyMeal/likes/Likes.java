package com.qqihan.MyMeal.likes;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@DynamoDBTable(tableName = "Likes")
public class Likes {

    @DynamoDBHashKey(attributeName = "userName")
    private String userName;

    @DynamoDBAttribute(attributeName = "restaurantName")
    private String restaurantName;
}
