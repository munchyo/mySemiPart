package semi.proj.PfF.product.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
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
	public String productList(@RequestParam(value="page", required=false) Integer currentPage, @RequestParam(value="productType", required=false) String productType, Model model) {
		if(currentPage == null) {
			currentPage = 1;
		}
		
		int listCount = pService.selectCountPrList(productType); // 상품총갯수
		
		PageInfo pi = Pagination.getPageInfo(currentPage, listCount, 12); // => 페이지네이션
	
		ArrayList<Product> list = pService.selectPrList(pi, productType); // => 상품리스트뽑아오기
		// 상품 type2, 대표사진, productName, productPrice
		
		System.out.println("상품리스트 : " + list);
		
		if(list != null) {
			model.addAttribute("productType", productType);
			model.addAttribute("pi", pi);
			model.addAttribute("list", list);
			return "productListCate1";
		} else {
			return null;
		}
		
	}
}
