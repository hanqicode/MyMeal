package com.qqihan.MyMeal.config;

import com.amazonaws.regions.Regions;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DynamoDBConfig {

    @Bean
    public DynamoDBMapper getDynamoDBMapper() {
        final AmazonDynamoDB client = AmazonDynamoDBClientBuilder.standard().withRegion(Regions.US_WEST_2).build();
        return new DynamoDBMapper(client);
    }
}
