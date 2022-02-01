package com.cms.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum CardEvent {

    ORDER("ORDER"),
    SHIP("SHIP"),
    CONFIRM("CONFIRM"),
    ACTIVE("ACTIVE"),
    LOCK("LOCK"),
    BLOCK("BLOCK"),
    CLOSE("CLOSE")
    ;

    private String name;

}
