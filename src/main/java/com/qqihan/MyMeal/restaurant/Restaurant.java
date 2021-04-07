package com.qqihan.MyMeal.restaurant;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@DynamoDBTable(tableName = "Restaurants")
public class Restaurant {

    @DynamoDBHashKey(attributeName = "restaurantName")
    private String restaurantName;
}
