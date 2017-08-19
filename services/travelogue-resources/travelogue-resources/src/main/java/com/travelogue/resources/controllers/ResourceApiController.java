package com.travelogue.resources.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.travelogue.resources.api.ResourceApi;

import io.swagger.annotations.ApiParam;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-08-18T20:13:41.440Z")

@RestController
public class ResourceApiController implements ResourceApi {



    public ResponseEntity<Void> createResource(@ApiParam(value = "file detail") @RequestPart("file") MultipartFile resource,
        @ApiParam(value = "Description of file contents.") @RequestPart(value="Meta", required=false)  String meta) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<byte[]> getResource() {
        // do some magic!
        return new ResponseEntity<byte[]>(HttpStatus.OK);
    }

}
