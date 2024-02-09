package com.expense.dao;

import com.expense.dao.rowmapper.CategoryRowMapper;
import com.expense.dao.rowmapper.ExpenseRowMapper;
import com.expense.vo.CategoryVo;
import com.expense.vo.ExpenseVo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ExpenseRepositoryImpl implements ExpenseRepository {
    private static final Logger log = LoggerFactory.getLogger(ExpenseRepositoryImpl.class);

    private static final String SELECT_EXPENSE_QUERY = "select ID, DESCRIPTION, AMOUNT, CATG_NAME, CREATED_DT  from EXPENSE_DETAILS  order by ID desc";
    private static final String SELECT_CATEGORY_QUERY = "select ID , CATG_NAME  from CATEGORY order by catg_name";

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public int save(ExpenseVo book) {
        return 0;
    }

    @Override
    public int update(ExpenseVo book) {
        return 0;
    }

    @Override
    public ExpenseVo findById(Long id) {
        return null;
    }

    @Override
    public int deleteById(Long id) {
        return 0;
    }

    @Override
    public List<ExpenseVo> findAll() {
        List<ExpenseVo> expenseVoList = jdbcTemplate.query(SELECT_EXPENSE_QUERY, new ExpenseRowMapper());
        return expenseVoList;
    }

    @Override
    public int deleteAll() {
        return 0;
    }

    @Override


    public List<CategoryVo> getCategories() {
        List<CategoryVo> expenseVoList = jdbcTemplate.query(SELECT_CATEGORY_QUERY, new CategoryRowMapper());

        return expenseVoList;
    }
}
