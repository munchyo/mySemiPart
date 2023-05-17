package semi.proj.PfF.product.model.service;

import java.util.ArrayList;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import semi.proj.PfF.product.model.dao.ProductDAO;
import semi.proj.PfF.product.model.vo.Product;

@Service
public class ProductService {
	
	@Autowired
	ProductDAO pDAO;
	
	@Autowired
	SqlSessionTemplate sqlSession;

	public ArrayList<Product> selectPrTypeList(String productType) {
		return pDAO.selectPrTypeList(sqlSession, productType);
	}
	
}
