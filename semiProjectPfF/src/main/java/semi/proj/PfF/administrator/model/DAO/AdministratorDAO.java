package semi.proj.PfF.administrator.model.DAO;

import java.util.ArrayList;
import java.util.Date;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class AdministratorDAO {

	public ArrayList<Integer> selectNumPayer(SqlSessionTemplate sqlSession, Date oneMonthAgo) {
		return (ArrayList)sqlSession.selectList("administratorMapper.selectNumPayer", oneMonthAgo);
	}

	public ArrayList<Integer> selectNumPay(SqlSessionTemplate sqlSession, Date oneMonthAgo) {
		return (ArrayList)sqlSession.selectList("administratorMapper.selectNumPay", oneMonthAgo);
	}

	public ArrayList<Date> selectDate(SqlSessionTemplate sqlSession, Date oneMonthAgo) {
		return (ArrayList)sqlSession.selectList("administratorMapper.selectDate", oneMonthAgo);
	}

	public ArrayList<Integer> selectSumPrice(SqlSessionTemplate sqlSession) {
		return (ArrayList)sqlSession.selectList("administratorMapper.selectSumPrice");
	}

	public ArrayList<Integer> selectAvgPrice(SqlSessionTemplate sqlSession) {
		return (ArrayList)sqlSession.selectList("administratorMapper.selectAvgPrice");
	}

	public ArrayList<Date> selectAmountPayDate(SqlSessionTemplate sqlSession) {
		return (ArrayList)sqlSession.selectList("administratorMapper.selectAmountPayDate");
	}
	
}
