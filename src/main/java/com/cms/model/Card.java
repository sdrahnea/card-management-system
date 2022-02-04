package com.cms.model;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Calendar;

@Data
public class Card {

    private CardCategory cardCategory;
    private CardStatus cardStatus;
    private BigDecimal amount;

    private Calendar createdDate;
    private Calendar updatedDate;
    private Calendar closedDate;
    private Calendar orderedDate;
    private Calendar shippedDate;

}
