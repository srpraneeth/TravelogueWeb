package com.travelogue.users.controllers;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.travelogue.users.api.UsersApi;
import com.travelogue.users.models.User;

import io.swagger.annotations.ApiParam;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-08-18T18:11:14.373Z")

@RestController
public class UsersApiController implements UsersApi {



    public ResponseEntity<Void> createUser(@ApiParam(value = ""  )  @Valid @RequestBody User user) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<User> getUser() {
        // do some magic!
        return new ResponseEntity<User>(HttpStatus.OK);
    }

    public ResponseEntity<User> putUsers() {
        // do some magic!
        return new ResponseEntity<User>(HttpStatus.OK);
    }

}
