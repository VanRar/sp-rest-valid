package ru.netology.sprestvalid.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ControllersAdvice {
    //обработчики, выбран будет тот, который ближе к ошибке
    @ExceptionHandler(RuntimeException.class)// указываем тип ошибки
    public ResponseEntity<String> handleRE(RuntimeException e){
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("RE error " +e.getLocalizedMessage());
    }

    @ExceptionHandler(IllegalArgumentException.class)// указываем тип ошибки
    public ResponseEntity<String> handleRE(IllegalArgumentException e){
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("IAE error " +e.getLocalizedMessage());
    }

}
