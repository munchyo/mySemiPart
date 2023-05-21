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
	
	@RequestMapping("numOfPay.ad")
	public void numOfPay(HttpServletResponse response) {
//		1. 결제자 수 , 날짜로 그룹바이 해서 COUNT 하는데 같은사람이 결제햇을때 중복이되면안됨 
//		2. 결제 수 , 날짜로 그룹바이해서 COUNT 해야하지않을까
//		3. 날짜들
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
	
	@RequestMapping("amountOfPay.ad")
	public void amountOfPay(HttpServletResponse response) {
//		1. 일별 결제 금액 , 날짜로 그룹바이해서 sum
//		2. 해당날짜 포함한 7일간평균 금액, 맨 첫날은 7일 평균이 없을테니 0으로 설정
//		3. 날짜들
		
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
