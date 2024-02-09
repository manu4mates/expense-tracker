package com.expense.dao.rowmapper;

import com.expense.vo.ExpenseVo;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ExpenseRowMapper implements RowMapper<ExpenseVo> {

    @Override
    public ExpenseVo mapRow(ResultSet rs, int rowNum) throws SQLException {
        ExpenseVo expenseVo = new ExpenseVo();
        expenseVo.setId(rs.getLong("id"));
        expenseVo.setDescription(rs.getString("DESCRIPTION"));
        expenseVo.setAmount(rs.getDouble("amount"));
        expenseVo.setCategory(rs.getString("CATG_NAME"));

        return expenseVo;
    }
}
