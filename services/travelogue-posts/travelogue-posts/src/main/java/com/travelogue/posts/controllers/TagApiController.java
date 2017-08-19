package com.travelogue.posts.controllers;

import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.travelogue.posts.api.TagApi;
import com.travelogue.posts.models.Tag;

import io.swagger.annotations.ApiParam;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-08-18T19:17:30.017Z")

@Controller
public class TagApiController implements TagApi {

	public ResponseEntity<Void> createTag(
			@ApiParam(value = "Tag to be created", required = true) @Valid @RequestBody Tag tag) {
		// do some magic!
		return new ResponseEntity<Void>(HttpStatus.OK);
	}

	public ResponseEntity<List<Tag>> searchTag(
			@NotNull @ApiParam(value = "Search parameter for Tag", required = true) @RequestParam(value = "q", required = true) String q,
			@ApiParam(value = "Search parameter for Tag Type") @RequestParam(value = "type", required = false) String type) {
		// do some magic!
		return new ResponseEntity<List<Tag>>(HttpStatus.OK);
	}

}
