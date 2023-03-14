package com.example.study_swagger.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class ResponseDto {
    @ApiModelProperty(value="필드 값", example="예시", required=true)
    private String a1;
   
    @ApiModelProperty(value="필드 값", example="예시")
    private String a2;
}
