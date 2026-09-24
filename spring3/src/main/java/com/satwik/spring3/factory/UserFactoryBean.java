package com.satwik.spring3.factory;

import com.satwik.spring3.model.User;
import org.jspecify.annotations.Nullable;
import org.springframework.beans.factory.FactoryBean;

public class UserFactoryBean implements FactoryBean<User> {

    @Override
    public @Nullable User getObject() throws Exception {
        User user = new User();

        user.setName("Satwik 12 Dev");
        user.setEmail("satwiksaxena41@gmail.com");

        return user;
    }

    @Override
    public @Nullable Class<?> getObjectType() {
        return User.class;
    }
}
