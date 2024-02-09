package com.expense.dao.rowmapper;

import com.expense.vo.CategoryVo;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CategoryRowMapper implements RowMapper<CategoryVo> {
    @Override
    public CategoryVo mapRow(ResultSet rs, int rowNum) throws SQLException {
        CategoryVo categoryVo = new CategoryVo();
        categoryVo.setId(rs.getLong("id"));
        categoryVo.setCategoryName(rs.getString("CATG_NAME"));
        return categoryVo;
    }
}
