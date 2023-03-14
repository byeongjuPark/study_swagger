package com.example.study_swagger.controller;

import java.util.List;
import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.study_swagger.dto.ResponseDto;
import com.example.study_swagger.entity.BoardEntity;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiResponse;
import io.swagger.v3.oas.annotations.Operation;

@Api(tags = "BoardController")
@RestController
public class BoardController {
    @Operation(summary="게시판 컨트롤러", description="게시판 관련 API")
    @ApiResponse(code = 200, message="ok")
    @PostMapping("/ex2/")
    public ResponseDto exampleMethod() {
    	return new ResponseDto();
    }
    @Operation(summary="게시판 컨트롤러", description="게시판 관련 API")
    @ApiResponse(code = 200, message="ok")
    @GetMapping("/board")
    public List<BoardEntity> board(){
        List<BoardEntity> boardList = new ArrayList<>();
        boardList.add(new BoardEntity("1", "t1", "t3"));
        boardList.add(new BoardEntity("2", "t2", "t4"));
        return boardList;
    }
}
