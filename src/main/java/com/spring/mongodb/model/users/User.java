package com.spring.mongodb.model.users;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document("users")
public class User {
    private String id;
    private String name;
    private String email;
    private String password;
}
