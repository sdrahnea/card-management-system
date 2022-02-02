package com.cms.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum CardStatus {

    ORDERED("ORDERED"),
    SHIPPED("SHIPPED"),
    NEW("NEW"),
    NOT_CONFIRMED("NOT CONFIRMED"),
    CONFIRMED("CONFIRMED"),
    ACTIVE("ACTIVE"),
    LOCKED("LOCKED"),
    BLOCKED("BLOCKED"),
    CLOSED("CLOSED")
    ;

    private final String name;

}
