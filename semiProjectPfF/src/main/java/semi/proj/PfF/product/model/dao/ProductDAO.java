package semi.proj.PfF.product.model.dao;

import java.util.ArrayList;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import semi.proj.PfF.product.model.vo.Product;

@Repository
public class ProductDAO {

	public ArrayList<Product> selectPrTypeList(SqlSessionTemplate sqlSession, String productType) {
		return (ArrayList)sqlSession.selectList("productMapper.selectPrTypeList", productType);
	}
	
}
