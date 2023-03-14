package com.example.study_swagger.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Builder
@ToString
@AllArgsConstructor
@NoArgsConstructor
// @Entity
public class BoardEntity {
    // @Id
    @ApiModelProperty(value="Board seq", example="48", required=true)
    private String seq;
    @ApiModelProperty(value="Board Title", example="제목입니다.", required=true)
    // @Column
    private String title;
    @ApiModelProperty(value="Board Contents", example="내용이 들어가는 곳.")
    // @Column
    private Object content;

}
