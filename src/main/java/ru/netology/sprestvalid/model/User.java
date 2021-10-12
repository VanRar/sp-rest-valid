package ru.netology.sprestvalid.model;

import org.springframework.validation.annotation.Validated;
import ru.netology.sprestvalid.enums.Authorities;

import javax.validation.constraints.NotBlank;
import java.util.List;

@Validated
public class User {

    @NotBlank(message = "Enter name users")
    private String userName;

    @NotBlank(message = "Enter password users")
    private String password;
    private List<Authorities> permission;

    public User() {
    }

    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Authorities> getPermission() {
        return permission;
    }

    public void setPermission(List<Authorities> permission) {
        this.permission = permission;
    }

    @Override
    public String toString() {
        return userName + " " + password;
    }
}
