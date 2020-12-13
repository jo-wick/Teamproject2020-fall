package com.team.user;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.team.table.ProductVO;

@Repository
public class UserDAO {
	@Autowired
	SqlSessionTemplate sqlSession;
	public UserVO getUser(UserVO vo) {
		return sqlSession.selectOne("User.getUser", vo);
	}
	

	public int insertUser(UserVO vo) {
		return sqlSession.insert("User.insertUser", vo);
	}

}
