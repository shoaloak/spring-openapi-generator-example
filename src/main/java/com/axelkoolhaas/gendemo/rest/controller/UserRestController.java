package com.axelkoolhaas.gendemo.rest.controller;

import com.axelkoolhaas.gendemo.rest.api.UsersApi;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

@Controller
public class UserRestController implements UsersApi {

    @Override
    public ResponseEntity<Void> getUserById(Integer id) {
        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }

    @Override
    public ResponseEntity<Void> getUsers() {
        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }
}
