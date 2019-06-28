package com.francis.tmall.service;

import com.francis.tmall.pojo.Category;
import com.francis.tmall.util.Page;

import java.util.List;

public interface CategoryService {
//    List<Category> list(Page page);
    List<Category> list();

//    int total();

    void add(Category category);

    void delete(int id);

    //编辑
    Category get(Integer id);

    //修改功能
    //update 返回的是 matched的记录数量值
//    int update(String name,int id);
    void update(Category category);

}
