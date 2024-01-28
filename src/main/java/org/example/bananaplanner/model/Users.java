package org.example.bananaplanner.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer user_number;
    private String user_id;
    private String pw;
    private String name;
    private Integer age;

    public Users(String user_id, String pw, String name) {
        this.user_id = user_id;
        this.pw = pw;
        this.name = name;
    }

    public Users() {

    }
}
