package semi.proj.PfF.administrator.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonIOException;

import semi.proj.PfF.administrator.model.service.AdministratorService;

@Controller
public class AdministratorController {
	
	@Autowired
	AdministratorService aService;
	
	@RequestMapping("statistics.ad")
	public String statistics() {
		return "statistics";
	}
	
	// ������/���� �� ���
	@RequestMapping("numOfPay.ad")
	public void numOfPay(HttpServletResponse response) {
//		1. ������ �� , ��¥�� �׷���� �ؼ� COUNT �ϴµ� ��������� ���������� �ߺ��̵Ǹ�ȵ� 
//		2. ���� �� , ��¥�� �׷�����ؼ� COUNT �ؾ�����������
//		3. ��¥��
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.MONTH, -1);
		Date oneMonthAgo = calendar.getTime();
		
		ArrayList<Integer> numPayer	= aService.selectNumPayer(oneMonthAgo);
		ArrayList<Integer> numPay = aService.selectNumPay(oneMonthAgo);
		ArrayList<Date> date = aService.selectDate(oneMonthAgo);
		
		response.setContentType("application/json; charset=UTF-8");
		
		GsonBuilder gb = new GsonBuilder().setDateFormat("yyyy-MM-dd");
		Gson gson = gb.create();
		
		Map<String, Object> responseData = new HashMap<>();
	    responseData.put("numPayer", numPayer);
	    responseData.put("numPay", numPay);
	    responseData.put("date", date);
		
		try {
			gson.toJson(responseData, response.getWriter());
		} catch (JsonIOException | IOException e) {
			e.printStackTrace();
		}
		
	}
	
	// �Ϻ������ݾ� ���
	@RequestMapping("amountOfPay.ad")
	public void amountOfPay(HttpServletResponse response) {
//		1. �Ϻ� ���� �ݾ� , ��¥�� �׷�����ؼ� sum
//		2. �ش糯¥ ������ 7�ϰ���� �ݾ�, �� ù���� 7�� ����� �����״� 0���� ����
//		3. ��¥��
		
		ArrayList<Integer> sumPrice = aService.selectSumPrice();
		ArrayList<Integer> avgPrice = aService.selectAvgPrice();
		avgPrice.add(0, 0);
		ArrayList<Date> date = aService.selectAmountPayDate();
		
		response.setContentType("application/json; charset=UTF-8");
		
		GsonBuilder gb = new GsonBuilder().setDateFormat("yyyy-MM-dd");
		Gson gson = gb.create();
		
		Map<String, Object> responseData = new HashMap<>();
		responseData.put("sumPrice", sumPrice);
	    responseData.put("avgPrice", avgPrice);
	    responseData.put("date", date);
	    
	    try {
			gson.toJson(responseData, response.getWriter());
		} catch (JsonIOException | IOException e) {
			e.printStackTrace();
		}
		
	}
	
}
