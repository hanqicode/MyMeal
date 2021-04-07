package com.qqihan.MyMeal.user;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@DynamoDBTable(tableName = "Users")
public class User {

    @DynamoDBHashKey(attributeName = "userName")
    private String userName;

    @DynamoDBAttribute(attributeName = "password")
    private String password;
}
