package semi.proj.PfF.product.model.dao;

import java.util.ArrayList;

import org.apache.ibatis.session.RowBounds;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import semi.proj.PfF.common.model.vo.PageInfo;
import semi.proj.PfF.product.model.vo.Product;

@Repository
public class ProductDAO {

	public int selectCountPrList(SqlSessionTemplate sqlSession, String productType) {
		return sqlSession.selectOne("productMapper.selectCountPrList", productType);
	}

	public ArrayList<Product> selectPrList(SqlSessionTemplate sqlSession, PageInfo pi, String productType) {
		int offset = (pi.getCurrentPage() - 1) * pi.getBoardLimit();
		RowBounds rowBounds = new RowBounds(offset, pi.getBoardLimit());
		return (ArrayList)sqlSession.selectList("productMapper.selectPrList", productType, rowBounds);
	}

	public ArrayList<String> selectType2(SqlSessionTemplate sqlSession, String productType) {
		return (ArrayList)sqlSession.selectList("productMapper.selectType2", productType);
	}
	
}
