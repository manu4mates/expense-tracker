package com.expense.vo;

import lombok.Data;

@Data
public class CategoryVo {
    private long id;
    private String categoryName;

    public CategoryVo() {

    }

    public CategoryVo(long id, String categoryName) {
        this.id=id;
        this.categoryName=categoryName;
    }
}
