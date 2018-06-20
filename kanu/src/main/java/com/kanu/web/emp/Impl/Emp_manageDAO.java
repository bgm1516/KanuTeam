package com.kanu.web.emp.Impl;

import java.util.List;

import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.kanu.web.emp.Emp_manageService;
import com.kanu.web.emp.Emp_manageVO;

public class Emp_manageDAO implements Emp_manageService{
	@Autowired
	SqlSessionFactory mybatis; 
	
	@Override
	public Emp_manageVO getEmp() {
		return null;
	}

	@Override
	public List<Emp_manageVO> getEmpList() {
		return null;
	}

	@Override
	public void insertEmp() {
		
	}

	@Override
	public void updateEmp() {
		
	}

	@Override
	public void deleteEmp() {
		
	}

}
