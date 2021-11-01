package com.cms.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum CardCategory {

    /**
     * These cards allow the customer to withdraw, deposit, or transfer money from any automatic
     * teller machines. In addition, ATM cards let a customer get a cash advance, check her account
     * balance, and make a loan payment.
     */
    ATM("ATM"),
    /**
     * Also called check cards, debit cards combine the functionality of an ATM card and a check,
     * debit cards let the account holder make purchases at retailers and also work as ATM cards.
     * When used as a check, the funds automatically come out of the respective account.
     */
    DEBIT("DEBIT"),
    /**
     * A prepaid debit card carries a set amount of money and only allows the card holder to spend
     * the balance on the card. Once the money runs out, the customer must refill the card.
     */
    PREPAID_DEBIT("PREPAID_DEBIT"),
    /**
     * A form of revolving loan, credit cards let the customer make purchases against a line of credit.
     * If the balance is paid off before the end of the month, no interest is charged on the loan.
     * Balances held longer than one month incur interest charges.
     */
    CREDIT("CREDIT");

    private final String name;

}
