package com.project.projectweb;

import com.project.projectweb.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        User u1 = new User (null, "Maria", "maria@gmail.com", "9888", "1234");
        User u2 = new User(null, "Alex", "alex@gmail.com", "9777", "12344");

        userRepository.saveAll(Arrays.asList(u1, u2));
    }
}
