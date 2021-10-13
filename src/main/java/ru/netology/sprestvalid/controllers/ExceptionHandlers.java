package ru.netology.sprestvalid.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import ru.netology.sprestvalid.exceptions.InvalidCredentials;
import ru.netology.sprestvalid.exceptions.UnauthorizedUser;

@RestControllerAdvice
public class ExceptionHandlers {

    @ExceptionHandler(UnauthorizedUser.class)
    public ResponseEntity<String> handleUnauthorized(UnauthorizedUser e) {
        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(e.getLocalizedMessage());
    }

    @ExceptionHandler(InvalidCredentials.class)
    public ResponseEntity<String> invalidCredentials(InvalidCredentials e) {
        System.out.println(e.getLocalizedMessage());
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getLocalizedMessage());
    }
}
