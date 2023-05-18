package semi.proj.PfF.product.model.service;

import java.util.ArrayList;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import semi.proj.PfF.common.model.vo.PageInfo;
import semi.proj.PfF.product.model.dao.ProductDAO;
import semi.proj.PfF.product.model.vo.Product;

@Service
public class ProductService {
	
	@Autowired
	ProductDAO pDAO;
	
	@Autowired
	SqlSessionTemplate sqlSession;

	public int selectCountPrList(String productType) {
		return pDAO.selectCountPrList(sqlSession, productType);
	}

	public ArrayList<Product> selectPrList(PageInfo pi, String productType) {
		return pDAO.selectPrList(sqlSession, pi, productType);
	}
	
}
