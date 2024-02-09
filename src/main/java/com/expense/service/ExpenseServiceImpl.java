package com.expense.service;

import com.expense.dao.ExpenseRepository;
import com.expense.vo.CategoryVo;
import com.expense.vo.ExpenseVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExpenseServiceImpl implements ExpenseService {

    @Autowired
    private ExpenseRepository expenseRepository;

    @Override
    public List<ExpenseVo> getActiveExpenses() {
        return expenseRepository.findAll();
    }

    @Override
    public int updateExpense(ExpenseVo expenseVo) {
        return 0;
    }

    @Override
    public int deleteExpense(int expenseId) {
        return 0;
    }

    @Override
    public List<CategoryVo> getCategories() {
        return expenseRepository.getCategories();
    }
}
