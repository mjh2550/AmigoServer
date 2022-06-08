package com.spring.amigo.common.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Data
@Getter @Setter
public class BoardVO {

    private String idx;
    private String title;
    private String contents;
    private String readCount;
    private String noticeFlag;
    private String insertUser;
    private String insertDate;
    private String insertIp;

}
