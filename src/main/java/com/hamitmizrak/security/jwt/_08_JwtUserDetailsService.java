package com.hamitmizrak.security.jwt;

import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@Log4j2
public class _08_JwtUserDetailsService implements UserDetailsService {

    @Autowired
    private _03_UserRepository  userDao;

    @Autowired
    private PasswordEncoder bcryptEncoder;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        //database böyle bir kullanıcı var mı?
        _02_UserEntity user = (_02_UserEntity) userDao.findByUsername(username);

        if (user == null) {
            log.error("Böyle bir kullanıcı Yoktur");
            throw new UsernameNotFoundException("Böyle bir kullanıcı yoktur " + username);
        }
        return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(),
                new ArrayList<>());
    }

    //Database Username ve Passwordu set
    //password: maskelenmiş ==> maskeyi kaldırmak bcryptEncoder
    public _02_UserEntity save(_01_UserDto user) {
        _02_UserEntity newUser = new _02_UserEntity();
        newUser.setUsername(user.getUsername());
        newUser.setPassword(bcryptEncoder.encode(user.getPassword()));
        return userDao.save(newUser);
    }
}