package com.expense.service;

import com.expense.vo.CategoryVo;
import com.expense.vo.ExpenseVo;

import java.util.List;

public interface ExpenseService {

    List<ExpenseVo> getActiveExpenses();

    int updateExpense(ExpenseVo expenseVo);

    int deleteExpense(int expenseId);


    List<CategoryVo> getCategories();
}
