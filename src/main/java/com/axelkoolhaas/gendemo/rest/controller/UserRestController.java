package com.axelkoolhaas.gendemo.rest.controller;

import com.axelkoolhaas.gendemo.rest.api.UsersApi;
import com.axelkoolhaas.gendemo.rest.dto.GetUserById200ResponseDto;
import com.axelkoolhaas.gendemo.rest.dto.RawDto;
import com.axelkoolhaas.gendemo.rest.dto.UserDto;
import org.apache.catalina.User;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

@Controller
public class UserRestController implements UsersApi {

    @Override
    public ResponseEntity<GetUserById200ResponseDto> getUserById(Integer id) {
        HttpHeaders responseHeaders = new HttpHeaders();
        GetUserById200ResponseDto responseDto;
        if (id == 1) {
            responseHeaders.setContentType(MediaType.TEXT_PLAIN);


            // Should've been String. OpenAPI generator doesn't support String yet.
            responseDto = new UserDto();
            responseHeaders.setContentType(MediaType.APPLICATION_JSON);
        } else {
            var user = new UserDto();
            user.setId(1);
            user.setFirstName("John");

            responseDto = user;
            responseHeaders.setContentType(MediaType.APPLICATION_JSON);
        }
        return new ResponseEntity<>(responseDto, responseHeaders,HttpStatus.OK);
    }

    @Override
    public ResponseEntity<String> getUsers() {
        return new ResponseEntity<>("Hello there", HttpStatus.OK);
    }
}
