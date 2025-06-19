package com.app.hospital.Service;

import com.app.hospital.Entity.User; 
import com.app.hospital.Repository.UserRepo;

import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.security.core.userdetails.*; 
import org.springframework.stereotype.Service; 
 
import java.util.Collections; 
 
@Service 
public class UserDetailsServiceImpl implements UserDetailsService { 
 
    @Autowired 
    private UserRepo userRepository; 
 
    @Override 
    public UserDetails loadUserByUsername(String username) throws 
UsernameNotFoundException { 
        User user = userRepository.findByUsername(username) 
            .orElseThrow(() -> new UsernameNotFoundException("User not found")); 
 
        return new org.springframework.security.core.userdetails.User( 
                user.getUsername(), 
                user.getPassword(), 
                Collections.emptyList() 
        ); 
    } 
}

