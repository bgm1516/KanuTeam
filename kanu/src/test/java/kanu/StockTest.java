package kanu;

import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.kanu.web.stock.StockVO;
import com.kanu.web.stock.impl.StockDAO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
		locations={"classpath:/config/applicationContext.xml",
				"classpath:/config/transactionContext.xml"})
public class StockTest {
	
	@Autowired StockDAO stockDAO;
	@Test
	/*public void getStockList() {
	//전체조회
		//stockDAO.getStockList();
		List<Map<String, Object>> list = stockDAO.getStockList();
		System.out.println(list);
		
	}*/
	public void getStock() {
		StockVO stockVO = stockDAO.getStock("pizza");
		System.out.println(stockVO);
	}
}
