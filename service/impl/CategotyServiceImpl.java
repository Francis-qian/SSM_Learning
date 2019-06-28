package com.francis.tmall.service.impl;

import com.francis.tmall.mapper.CategoryMapper;
import com.francis.tmall.pojo.Category;
import com.francis.tmall.pojo.CategoryExample;
import com.francis.tmall.service.CategoryService;
import com.francis.tmall.util.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CategotyServiceImpl implements CategoryService {
    @Autowired
    CategoryMapper categoryMapper;
//    @Override
//    public List<Category> list(Page page){
//        return categoryMapper.list(page);
//    }

    @Override
    public List<Category> list(){
        CategoryExample example =new CategoryExample();
        example.setOrderByClause("id desc");
        return categoryMapper.selectByExample(example);
    }

//    @Override
//    public int total(){
//        return categoryMapper.total();
//    }

    @Override
    public void add(Category category){
        categoryMapper.insert(category);
    }

    @Override
    public void delete(int id){
        categoryMapper.deleteByPrimaryKey(id);
    }
    //编辑
    public Category get(Integer id){

        return categoryMapper.selectByPrimaryKey(id);
    }

    //修改
    @Override
    public void update(Category category){

        categoryMapper.updateByPrimaryKeySelective(category);
    }


}
