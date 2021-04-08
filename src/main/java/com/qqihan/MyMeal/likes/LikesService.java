package com.qqihan.MyMeal.likes;

import lombok.AllArgsConstructor;
import lombok.NonNull;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class LikesService {

    private final LikesAccessor accessor;

    public List<Likes> getAllUserLikesByUserName(@NonNull final String userName) {
        return accessor.getAllUserLikesByUserName(userName);
    }
}
