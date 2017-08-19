/**
 * NOTE: This class is auto generated by the swagger code generator program (2.2.3).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package com.travelogue.resources.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.Authorization;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-08-18T20:13:41.440Z")

@Api(value = "resource", description = "the resource API")
public interface ResourceApi {

    @ApiOperation(value = "CreateResource", notes = "Create Resource API", response = Void.class, authorizations = {
        @Authorization(value = "JWT")
    }, tags={ "CreateResource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Success", response = Void.class),
        @ApiResponse(code = 404, message = "NotFound", response = Void.class),
        @ApiResponse(code = 500, message = "Server Vault", response = Void.class) })
    
    @RequestMapping(value = "/resource",
        produces = { "application/json" }, 
        consumes = { "multipart/form-data" },
        method = RequestMethod.POST)
    ResponseEntity<Void> createResource(@ApiParam(value = "file detail") @RequestPart("file") MultipartFile resource,@ApiParam(value = "Description of file contents.") @RequestPart(value="Meta", required=false)  String meta);


    @ApiOperation(value = "Get Resource", notes = "Get Resource API", response = byte[].class, authorizations = {
        @Authorization(value = "JWT")
    }, tags={ "GetResource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Image as Binary Data", response = byte[].class),
        @ApiResponse(code = 404, message = "NotFound", response = Void.class),
        @ApiResponse(code = 500, message = "Server Vault", response = Void.class) })
    
    @RequestMapping(value = "/resource",
        produces = { "image/jpeg" }, 
        consumes = { "application/json" },
        method = RequestMethod.GET)
    ResponseEntity<byte[]> getResource();

}