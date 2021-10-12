package ru.netology.sprestvalid.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.netology.sprestvalid.enums.Authorities;
import ru.netology.sprestvalid.exceptions.InvalidCredentials;
import ru.netology.sprestvalid.exceptions.UnauthorizedUser;
import ru.netology.sprestvalid.repository.UserRepository;


import java.util.List;

@Service
public class AuthorizationService {
    @Autowired
    UserRepository userRepository;

    public UserRepository getUserRepository() {
        return userRepository;
    }

    public List<Authorities> getAuthorities(String user, String password) {
        if (isEmpty(user) || isEmpty(password)){
            throw new InvalidCredentials("User name or pass is empty");
        }
        List<Authorities> userAuthorities = userRepository.getUserAuthorities(user, password);

        if(isEmpty(userAuthorities)){
            throw new UnauthorizedUser("Unknown user" + user);
        }
        return userAuthorities;
    }
    private boolean isEmpty(String str){
        return str == null || str.isEmpty();
    }
    private boolean isEmpty(List<?> str){
        return str == null || str.isEmpty();
    }
}
