package com.travelogue.posts.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.travelogue.posts.api.PostApi;
import com.travelogue.posts.models.Comment;
import com.travelogue.posts.models.Post;
import com.travelogue.posts.models.Tag;

import io.swagger.annotations.ApiParam;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-08-18T19:17:30.017Z")

@RestController
public class PostApiController implements PostApi {

	public ResponseEntity<Void> commentToPostById(
			@ApiParam(value = "Post Id", required = true) @PathVariable("id") String id,
			@ApiParam(value = "Comment to the Post", required = true) @Valid @RequestBody Comment comment) {
		// do some magic!
		return new ResponseEntity<Void>(HttpStatus.OK);
	}

	public ResponseEntity<Void> createPost(@ApiParam(value = "Post", required = true) @Valid @RequestBody Post post) {
		// do some magic!
		return new ResponseEntity<Void>(HttpStatus.OK);
	}

	public ResponseEntity<Post> getPostById(
			@ApiParam(value = "Post Id", required = true) @PathVariable("id") String id) {
		// do some magic!
		return new ResponseEntity<Post>(HttpStatus.OK);
	}

	public ResponseEntity<Void> likeCommentByPostIdByCommentId(
			@ApiParam(value = "Post Id", required = true) @PathVariable("id") String id,
			@ApiParam(value = "Comment Id", required = true) @PathVariable("Id") String id2) {
		// do some magic!
		return new ResponseEntity<Void>(HttpStatus.OK);
	}

	public ResponseEntity<Void> likePostById(
			@ApiParam(value = "Post Id", required = true) @PathVariable("id") String id) {
		// do some magic!
		return new ResponseEntity<Void>(HttpStatus.OK);
	}

	public ResponseEntity<Void> updatePost(@ApiParam(value = "Post", required = true) @Valid @RequestBody Post post) {
		// do some magic!
		return new ResponseEntity<Void>(HttpStatus.OK);
	}

	public ResponseEntity<Void> updateTagsForPostById(
			@ApiParam(value = "Post Id", required = true) @PathVariable("id") String id,
			@ApiParam(value = "Tags to be updated", required = true) @Valid @RequestBody List<Tag> tags) {
		// do some magic!
		return new ResponseEntity<Void>(HttpStatus.OK);
	}

}
