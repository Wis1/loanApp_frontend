package com.wis1.loan.appLoan.calculate.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CalcResultDto {

    private String interest_rate;
    private String loan_amount;
    private String loan_interest;
    private String loan_type;
    private String monthly_payment;
    private String repayment_term;
    private List<ScheduleItem> schedule;

    @Override
    public String toString() {
        return "CalcResult: " +
                "interest_rate='" + interest_rate + '\'' +
                ", loan_amount='" + loan_amount + '\'' +
                ", loan_interest='" + loan_interest + '\'' +
                ", loan_type='" + loan_type + '\'' +
                ", monthly_payment='" + monthly_payment + '\'' +
                ", repayment_term='" + repayment_term + '\'' +
                ", schedule=" + schedule;
    }
}

@Getter
@Setter
class ScheduleItem {
    private String balance;
    private String interest;
    private String payment;
    private int period;
    private String principal;

    @Override
    public String toString() {
        return "ScheduleItem: " +
                "balance='" + balance + '\'' +
                ", interest='" + interest + '\'' +
                ", payment='" + payment + '\'' +
                ", period=" + period +
                ", principal='" + principal + '\'';
    }
}
