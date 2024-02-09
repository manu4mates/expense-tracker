package com.expense.vo;

import lombok.Data;

@Data
public class ExpenseVo {
    private long id;
    private String description;
    private double amount;
    private String category;

    public ExpenseVo(){}

    public ExpenseVo(long id, String description, double amount, String category) {
        this.id = id;
        this.description = description;
        this.amount = amount;
        this.category = category;
    }
}
