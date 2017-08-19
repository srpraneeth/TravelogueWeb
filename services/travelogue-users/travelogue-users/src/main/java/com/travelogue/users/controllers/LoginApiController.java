package com.travelogue.users.controllers;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.travelogue.users.api.LoginApi;
import com.travelogue.users.models.Login;
import com.travelogue.users.models.User;

import io.swagger.annotations.ApiParam;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-08-18T18:11:14.373Z")

@RestController
public class LoginApiController implements LoginApi {

	public ResponseEntity<User> loginUser(@ApiParam(value = "") @Valid @RequestBody Login login) {
		// do some magic!
		return new ResponseEntity<User>(HttpStatus.OK);
	}

	public ResponseEntity<Void> logoutUser() {
		// do some magic!
		return new ResponseEntity<Void>(HttpStatus.OK);
	}

}
