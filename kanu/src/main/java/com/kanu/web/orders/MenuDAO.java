package com.kanu.web.orders;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MenuDAO {

	@Autowired SqlSessionTemplate mybatis;
	
	//전체조회
	
	public List<Map<String,Object>> getMenuList(MenuVO menuVO){
		return mybatis.selectList("com.kanu.web.orders",menuVO);
		
	}
	
}
