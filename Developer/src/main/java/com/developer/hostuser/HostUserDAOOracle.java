package com.developer.hostuser;

<<<<<<< HEAD
import java.util.HashMap;
import java.util.List;
import java.util.Map;

=======
>>>>>>> 24016e656d39b0bdcea57683fe473175c58dd951
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.developer.exception.FindException;
import com.developer.resource.Factory;

public class HostUserDAOOracle implements HostUserDAO {
<<<<<<< HEAD
	private SqlSessionFactory sqlSessionFactory;
	
	public HostUserDAOOracle() {
		sqlSessionFactory = Factory.getSqlSessionFactory();
	}	

	@Override
	public List<HostUserVO> selectAll() throws FindException {
		// TODO Auto-generated method stub
		return null;
	}

	//근형 호스트회원 로그인
	@Override
	public HostUserVO hostLogin(String hostId) throws FindException {
		SqlSession session = sqlSessionFactory.openSession();
		HostUserVO vo = (HostUserVO) session.selectOne("com.developer.hostuser.hostLogin", hostId);
		session.close();
		return vo;
	}
	
	//근형 호스트회원 아이디찾기 
	@Override
	public HostUserVO selectHostId(String num) throws FindException {
		SqlSession session = sqlSessionFactory.openSession();
		HostUserVO vo = (HostUserVO) session.selectOne("com.developer.hostuser.selectHostId", num);
=======
	
	private SqlSessionFactory sqlSessionFactory;
	public HostUserDAOOracle() {
		sqlSessionFactory = Factory.getSqlSessionFactory();
	}

	//sr
	@Override
	public int deleteHostUser(String hostId) throws FindException {
		SqlSession session = sqlSessionFactory.openSession();
		int a = session.delete("com.developer.hostuser.deleteHostUser",hostId);
		session.commit();
		session.close();
		return a;	
	}

	//sr
	@Override
	public HostUserVO getHostUser(String hostId) throws FindException {
		SqlSession session = sqlSessionFactory.openSession();
		HostUserVO vo = (HostUserVO)session.selectOne("com.developer.hostuser.getHostUser", hostId);
>>>>>>> 24016e656d39b0bdcea57683fe473175c58dd951
		session.close();
		return vo;
	}

<<<<<<< HEAD
	//근형 호스트회원 비밀번호찾기
	@Override
	public HostUserVO selectHostPwd(String hostId, String num, String email) throws FindException {
		SqlSession session = sqlSessionFactory.openSession();
		Map<String,Object> param = new HashMap<String, Object>();
		param.put("hostId", hostId);
		param.put("num", num);
		param.put("email", email);
		HostUserVO vo = (HostUserVO) session.selectOne("com.developer.hostuser.selectHostPwd", param);
		session.close();
		return vo;
	}
 
=======
	//sr
	@Override
	public int updateHostUser(HostUserVO hostUserVO) throws FindException {
		SqlSession session = sqlSessionFactory.openSession();
		int a = session.update("com.developer.hostuser.updateHostUser", hostUserVO);
		session.commit();
		session.close();
		return a;
		
	}

>>>>>>> 24016e656d39b0bdcea57683fe473175c58dd951
}
