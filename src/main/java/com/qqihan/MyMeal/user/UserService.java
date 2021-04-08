package com.qqihan.MyMeal.user;

import lombok.AllArgsConstructor;
import lombok.NonNull;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserService {

    private final UserAccessor accessor;

    public User getUserByUsername(@NonNull final String username) {
        return accessor.getUserByUsername(username);
    }
}
