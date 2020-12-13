package com.team.table;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class ProductDAO {
	
	@Autowired
	SqlSession sqlSession;
	
	public int insertProduct(ProductVO vo) {
		return sqlSession.insert("Product.insertProduct", vo);
	}
	
	// 글 삭제
	public int deleteProduct(int sid) {
		return sqlSession.delete("Product.deleteProduct", sid);
	}
	
	public int updateProduct(ProductVO vo) {
		return sqlSession.update("Product.updateProduct", vo);
	}	
	
	public ProductVO getProduct(int sid) {
		return sqlSession.selectOne("Product.getProduct", sid);
	}
	
	public List<ProductVO> getProductList(){
		return sqlSession.selectList("Product.getProductList");
	}

}
