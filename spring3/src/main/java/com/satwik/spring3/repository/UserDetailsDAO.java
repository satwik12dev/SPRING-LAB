package com.satwik.spring3.repository;

import com.satwik.spring3.model.User;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDetailsDAO {

    private final JdbcTemplate jdbcTemplate;

    public UserDetailsDAO(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    // INSERT USER
    public int saveUser(User user) {
        String sql = " INSERT INTO users (name, email) VALUES (?, ?)";
        int count = jdbcTemplate.update(
                sql,
                user.getName(),
                user.getEmail()
        );
        System.out.println("User created successfully");
        return count;
    }

    // READ ALL USERS
    public List<User> getAllUsers() {
        String sql = "SELECT * FROM users";
        return jdbcTemplate.query(
                sql,
                (rs, rowNum) -> new User(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("email")
                )
        );
    }

    //Read Single User
    // READ SINGLE USER
    public User getSingleUser(int id) {

        String sql = "SELECT * FROM users WHERE id = ?";

        return jdbcTemplate.queryForObject(
                sql,
                (rs, rowNum) -> new User(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("email")
                ),
                id
        );
    }
}