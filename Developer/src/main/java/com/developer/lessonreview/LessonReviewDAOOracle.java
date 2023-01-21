package com.developer.lessonreview;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.developer.appliedlesson.AppliedLessonVO;
import com.developer.exception.FindException;
import com.developer.resource.Factory;

public class LessonReviewDAOOracle implements LessonReviewDAO {
<<<<<<< HEAD
	private SqlSessionFactory sqlSessionFactory;

=======
	
	private SqlSessionFactory sqlSessionFactory;
	
>>>>>>> 24016e656d39b0bdcea57683fe473175c58dd951
	public LessonReviewDAOOracle() {
		sqlSessionFactory = Factory.getSqlSessionFactory();
	}
	
<<<<<<< HEAD
	//근형
	@Override
	public List<AppliedLessonVO> selectLessonReview(int lessonSeq) throws FindException {
		
		SqlSession session = sqlSessionFactory.openSession();
		List<AppliedLessonVO> list = session.selectList("com.developer.lessonReview.selectLessonReview", lessonSeq);
		session.close();
		return list;
	}

=======
	public static void main(String[] args) throws FindException {
		LessonReviewDAOOracle dao = new LessonReviewDAOOracle();
		List<AppliedLessonVO>list = dao.noWriteReview("devman");
		System.out.println(list);
	}

	//지원
	@Override
	public int cntReviewTutor(String userId) throws FindException {
		SqlSession session = sqlSessionFactory.openSession();
		int cntReview = session.selectOne("com.developer.lessonreview.cntReview", userId);
		session.commit();
		session.close();
		return cntReview;
	}

	//지원 
	@Override
	public void addReview(LessonReviewVO lessonReviewVO) throws FindException {
		SqlSession session = sqlSessionFactory.openSession();
		session.selectOne("com.developer.lessonreview.addReview", lessonReviewVO);
		session.commit();
		session.close();
	}

	//지원 
	@Override
	public List<AppliedLessonVO> noWriteReview(String userId) throws FindException {
		SqlSession session = sqlSessionFactory.openSession();
		List<AppliedLessonVO> noWriteReview = session.selectList("com.developer.lessonreview.noWriteReview", userId);
		session.commit();
		session.close();
		return noWriteReview;
	}
	
	
	//지원 
	@Override
	public List<AppliedLessonVO> myReviewList(String userId) throws FindException {
		SqlSession session = sqlSessionFactory.openSession();
		List<AppliedLessonVO> myReviewList = session.selectList("com.developer.lessonreview.myReviewList", userId);
		session.commit();
		session.close();
		return myReviewList;
	}


>>>>>>> 24016e656d39b0bdcea57683fe473175c58dd951
}
