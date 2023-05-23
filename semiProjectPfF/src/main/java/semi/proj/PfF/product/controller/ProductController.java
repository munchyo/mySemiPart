package semi.proj.PfF.product.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;

import semi.proj.PfF.common.Pagination;
import semi.proj.PfF.common.model.vo.PageInfo;
import semi.proj.PfF.product.model.service.ProductService;
import semi.proj.PfF.product.model.vo.Product;

@Controller
public class ProductController {

	@Autowired
	ProductService pService;
	
	@GetMapping("productList.pr")
	public String productList(@RequestParam(value="page", required=false) Integer currentPage, @ModelAttribute Product productType, Model model) {
		
		if(currentPage == null) {
			currentPage = 1;
		} else if(currentPage < 0) {
			currentPage = 1;
		}
		
		if(productType.getproductType2() == null) productType.setProductType2("��ü");
		
		int listCount = pService.selectCountPrList(productType); // 상품총갯수
		
		ArrayList<String> ProductType2 = pService.selectType2(productType);	// productType2 추출
		
		PageInfo pi = Pagination.getPageInfo(currentPage, listCount, 20); // => 페이지네이션
		
		ArrayList<Product> list = pService.selectPrList(pi, productType); // => 전체 상품리스트뽑아오기
		// ��ǰ type2, ��ǥ����, productName, productPrice
		
		model.addAttribute("productType", productType.getProductType());	// 어떤카테고리를 볼지 위함
		model.addAttribute("productType2", productType.getproductType2());	// 어떤카테고리를 볼지 위함
		model.addAttribute("productType2List", ProductType2);	// 카테고리2 조회하기위함
		model.addAttribute("pi", pi);	// 페이지네이션
		model.addAttribute("list", list);	// 페이지네이션된 리스트
		return "productList";
	}
}
