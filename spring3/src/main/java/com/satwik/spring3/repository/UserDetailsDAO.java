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

    // CREATE TABLE
    public void createTable() {

        String sql = """
                CREATE TABLE IF NOT EXISTS users (
                    id INT PRIMARY KEY AUTO_INCREMENT,
                    name VARCHAR(100) NOT NULL,
                    email VARCHAR(255) NOT NULL
                )
                """;

        jdbcTemplate.execute(sql);

        System.out.println("Users table created successfully");
    }

    // INSERT USER
    public void saveUser(User user) {

        String sql = """
                INSERT INTO users (name, email)
                VALUES (?, ?)
                """;

        jdbcTemplate.update(
                sql,
                user.getName(),
                user.getEmail()
        );
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
}