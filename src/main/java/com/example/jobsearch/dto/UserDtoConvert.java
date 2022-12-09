package com.example.jobsearch.dto;

import com.example.jobsearch.model.User;
import org.springframework.stereotype.Component;

@Component
public class UserDtoConvert {

    public UserDto convert(User from) {
        return new UserDto(
                from.getEmail(),
                from.getPassword()
        );
    }
}
