package com.springboot.bookheist.service;

import com.springboot.bookheist.model.User;
import com.springboot.bookheist.model.UserPrincipal;
import com.springboot.bookheist.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailService implements UserDetailsService {

    @Autowired
    private UserRepo repo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        User user = repo.findByUsername(username);
        if (user == null){
            System.out.println("user 404");
            throw new UsernameNotFoundException("Not found user");
        }
        return new UserPrincipal(user);
    }
}
