package com.spring.amigo.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Data
@Getter @Setter
public class BoardVO {

    private String board_idx;
    private String board_title;
    private String board_contents;
    private String read_count;
    private String notice_flag;
    private String insert_user;
    private String insert_time;
    private String insert_ip;

}
