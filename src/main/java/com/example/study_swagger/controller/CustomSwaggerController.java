package com.example.study_swagger.controller;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.study_swagger.dto.ResponseDto;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiResponse;
import io.swagger.v3.oas.annotations.Operation;

@Api(tags = "CustomSwaggerController")
@RestController
public class CustomSwaggerController {
    @Operation(summary="요약", description="설명")
    @ApiResponse(code = 200, message="ok")
    @PostMapping("/ex/")
    public ResponseDto exampleMethod() {
    	return new ResponseDto();
    } 
}
