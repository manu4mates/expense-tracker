package com.expense.controller;

import com.expense.service.ExpenseService;
import com.expense.vo.CategoryVo;
import com.expense.vo.ExpenseVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/")
@CrossOrigin(origins = {"http://localhost:5173/"})
public class ExpenseController {

    @Autowired
    private ExpenseService expenseService;

    @GetMapping("expenses")
    public List<ExpenseVo> getExpenses() {
        return expenseService.getActiveExpenses();
    }

    @GetMapping("categories")
    public List<CategoryVo> getCategories() {
        return expenseService.getCategories();
    }

}
