package com.spring.amigo.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data @Getter @Setter
public class TestVO {

    private String id;
    private String name;

    public TestVO(String id , String name){
        this.id = id;
        this.name = name;
    }
}
