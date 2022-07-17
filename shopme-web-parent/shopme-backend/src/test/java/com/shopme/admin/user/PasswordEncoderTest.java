package com.shopme.admin.user;

import org.junit.jupiter.api.Test;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class PasswordEncoderTest {

    @Test
    public void testEncodePassword() {
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String rawPassword = "123456789";
        String encodedPassword = passwordEncoder.encode(rawPassword);

        System.out.println(encodedPassword);

        boolean is_matched = passwordEncoder.matches(rawPassword, encodedPassword);
        assertTrue(is_matched);
    }
}
