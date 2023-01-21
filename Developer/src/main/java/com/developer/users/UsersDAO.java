package com.developer.users;

import java.util.List;

import com.developer.appliedlesson.AppliedLessonVO;
import com.developer.exception.FindException;
import com.developer.hostuser.HostUserVO;
import com.developer.lesson.LessonVO;
import com.developer.lessonreview.LessonReviewVO;

public interface UsersDAO {
	
	/**
	 * <관리자 : 일반회원 전체목록 페이지>회원 목록 출력
	 * @author choigeunhyeong
	 * @return 회원테이블 전체값
	 * @throws FindException
	 */
	public List<UsersVO> selectAll() throws FindException;
	
	/**
	 * <일반회원 : 로그인페이지> 로그인 하기위한 회원 검색 
	 * @author choigeunhyeong
	 * @param userId 로그인할 아이디
	 * @return userId로 검색한 UsersVO 객체 반환
	 * @throws FindException
	 */
	public UsersVO userLogin(String userId) throws FindException;
	
	/**
	 * <일반회원 : 아이디찾기 페이지> 일반 회원 아이디 찾기 
	 * @author choigeunhyeong
	 * @param email 입력할 이메일
	 * @return 입력받은 email과 일치하는 id값 userId
	 * @throws FindException
	 */
	public UsersVO selectUserId(String email) throws FindException;
	
	/**
	 * <일반회원 : 비밀번호찾기 페이지 >일반회원 비밀번호 찾기
	 * @author choigeunhyeong
	 * @param userId 입력할 아이디
	 * @param email 입력할 이메일
	 * @return 아이디와 이메일이 일치하는 녀석의 비밀번호 pwd
	 * @throws FindException
	 */
	public UsersVO selectUserPwd(String userId, String email) throws FindException;	
	
}
