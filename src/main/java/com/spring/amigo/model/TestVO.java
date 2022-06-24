package com.spring.amigo.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data @Getter @Setter
public class TestVO {

    @ApiModelProperty(value = "test ID", dataType = "string" , required = true)
    private String id;
    @ApiModelProperty(value = "test Name", dataType = "String")
    private String name;

    public TestVO(String id , String name){
        this.id = id;
        this.name = name;
    }
}
