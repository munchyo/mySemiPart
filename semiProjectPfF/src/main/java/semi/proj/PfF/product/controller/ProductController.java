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
	
	@GetMapping(".pr")
	public String productList(@RequestParam(value="page", required=false) Integer currentPage, @RequestParam("productType") String productType, Model model) {
		if(currentPage == null) {
			currentPage = 1;
		}
		
		ArrayList<Product> productList = pService.selectPrTypeList(productType);// 상품 총 갯수, 상품 type2, 대표사진, productName, productPrice 활용가능
		// 상품타입2는 중복된게 나올거같네, 페이지네이션도 적용안해서 다시생각해야할거같다
		
		int listCount = productList.size(); // 상품총갯수
		
		PageInfo pi = Pagination.getPageInfo(currentPage, listCount, 12); // => 페이지네이션
		
//		ArrayList<Product> list = 상품리스트; => 상품리스트뽑아오기
		
//		if(list != null) {
//			model.addAttribute("pi", pi);
//			model.addAttribute("list", list);
//			return "boardList";
//		} else {
//			throw new BoardException("게시글 조회를 실패하였습니다.");
//		}
		
		return null;
	}
}
