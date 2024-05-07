package com.example;

import org.mindrot.jbcrypt.BCrypt;

public class PasswordUtil {

    // Generate a salted and hashed password
    public static String hashPassword(String plainPassword) {
        String salt = BCrypt.gensalt(12); // Generate a salt with strength 12
        return BCrypt.hashpw(plainPassword, salt);
    }

    // Verify a plaintext password against a stored hash
    public static boolean verifyPassword(String plainPassword, String hashedPassword) {
        return BCrypt.checkpw(plainPassword, hashedPassword);
    }
}
