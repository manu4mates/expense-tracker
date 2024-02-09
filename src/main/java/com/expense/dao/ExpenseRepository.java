package com.expense.dao;

import com.expense.vo.CategoryVo;
import com.expense.vo.ExpenseVo;

import java.util.List;

public interface ExpenseRepository {

    int save(ExpenseVo book);

    int update(ExpenseVo book);

    ExpenseVo findById(Long id);

    int deleteById(Long id);

    List<ExpenseVo> findAll();

    int deleteAll();

    List<CategoryVo> getCategories();
}
