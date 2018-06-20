package com.kanu.web.orders;

import java.util.ArrayList;
import java.util.List;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
		locations={"classpath:/config/applicationContext.xml",
				"classpath:/config/transactionContext.xml"})
public class MenuClientSpring {
	
	@Autowired MenuDAO menuDAO;
	
	//다건 삭제
	
	@Test
	public void menuDeleteTest() {
		List<String> list=	new ArrayList<String>();
		list.add("300");
		list.add("310"); 
		list.add("330");
		menuDAO.deleteMenu(list); 
	}
	//다건 조회
	@Test
	@Ignore
	public void getMenuTest() {
		
		MenuVO menuVO = new MenuVO();
		menuVO.setMenu_id("101");
		menuVO.setMenu_name("c");
		List<Map<String,Object>> list =
		
	}

}
