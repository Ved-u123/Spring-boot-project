package com.app.hospital.Service;
import com.app.hospital.DTO.signuprequest; 
import com.app.hospital.Entity.User; 
import com.app.hospital.Repository.UserRepo; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.security.crypto.password.PasswordEncoder; 
import org.springframework.stereotype.Service; 
 
     

@Service 
public class UserService { 
 
    @Autowired 
    private UserRepo userRepository; 
 
    @Autowired 
    private PasswordEncoder passwordEncoder; 
 
    public void register(signuprequest request) { 
        if (userRepository.existsByUsername(request.getUsername())) { 
            throw new RuntimeException("Username already exists"); 
        } 
 
        User user = new User(); 
        user.setUsername(request.getUsername()); 
        user.setName(request.getName()); 
        user.setPassword(passwordEncoder.encode(request.getPassword())); 
        user.setEmail(request.getEmail()); 
        user.setPhone(request.getPhone()); 
 
        userRepository.save(user); 
    }

    public User getUserByUsername(String username) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getUserByUsername'");
    } 
}

