package com.kanu.web.emp;

import java.util.List;

public interface Emp_manageService {

	public Emp_manageVO getEmp();
	public List<Emp_manageVO> getEmpList();
	public void insertEmp();
	public void updateEmp();
	public void deleteEmp();
	
}
