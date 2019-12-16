package io.javabrains.springsecurityjpamysql.services;

import io.javabrains.springsecurityjpamysql.model.MyUserDetails;
import io.javabrains.springsecurityjpamysql.model.User;
import io.javabrains.springsecurityjpamysql.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
    @Autowired
    UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<User> user = userRepository.findByusername(username);
        user.orElseThrow(() -> new UsernameNotFoundException("invalid user name"));
        return user.map(MyUserDetails::new).get();
    }
}
