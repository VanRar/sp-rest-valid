package ru.netology.sprestvalid.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.BAD_REQUEST, reason = "User name or pass is empty")
public class InvalidCredentials extends RuntimeException{
    public InvalidCredentials(String msg){
        super(msg);
    }
}
