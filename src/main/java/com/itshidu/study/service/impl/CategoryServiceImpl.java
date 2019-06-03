package com.itshidu.study.service.impl;

import com.itshidu.study.dao.CategoryDao;
import com.itshidu.study.dao.CourseDao;
import com.itshidu.study.entity.Category;
import com.itshidu.study.entity.Course;
import com.itshidu.study.service.CategoryService;
import com.itshidu.study.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import static javafx.scene.input.KeyCode.R;

@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired CategoryDao categoryDao;
    @Autowired CourseDao courseDao;
 /*   @Override
    public Result save(long parentid ,String name) {
        Category c = new Category();
        c.setName(name);
        c.setParent_id(parentid);
        categoryDao.save(c);

        return  null ;
    }*/

    @Override
    public List<Category> findall() {

        return categoryDao.findAll();
    }

	@Override
	public List<Course> findAllByCategoryid(long id) {
		// TODO Auto-generated method stub
		return courseDao.findAllByCategoryid(id);
	}

	@Override
	public List<Course> findpriceById(long id) {
		// TODO Auto-generated method stub
		return  courseDao.findpriceById(id);
	}

	@Override
	public Object save(Course course) {
		courseDao.save(course);
		return null;
	}
}
