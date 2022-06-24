package com.spring.amigo.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@ApiModel(description = "게시판 객체")
@Data @Getter @Setter
public class BoardVO {

    @ApiModelProperty(value = "게시물 key",dataType = "Int", required = true)
    private Integer board_idx;

    @ApiModelProperty(value = "게시물 제목",dataType = "string")
    private String board_title;

    @ApiModelProperty(value = "게시물 내용",dataType = "string")
    private String board_contents;

    @ApiModelProperty(value = "조회 수" ,dataType = "string")
    private String read_count;

    @ApiModelProperty(value = "공지여부" ,dataType = "string")
    private String notice_flag;

    @ApiModelProperty(value = "글쓴이" ,dataType = "string")
    private String insert_user;

    @ApiModelProperty(value = "시간" ,dataType = "string")
    private String insert_time;

    @ApiModelProperty(value = "글쓴이 ip" ,dataType = "string")
    private String insert_ip;

}
