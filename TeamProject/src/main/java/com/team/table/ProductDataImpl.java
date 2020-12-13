package com.team.table;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductDataImpl implements ProductService{

	@Autowired
	ProductDAO productDAO;
	
	public int insertProduct(ProductVO vo) {
		return productDAO.insertProduct(vo);
	}
	
	public int deleteProduct(int sid) {
		return productDAO.deleteProduct(sid);
	}
	
	public int updateProduct(ProductVO vo) {
		return productDAO.updateProduct(vo);
	}
	
	public ProductVO getProduct(int sid) {
		return productDAO.getProduct(sid);
	}
	
	public List<ProductVO> getProductList(){
		return productDAO.getProductList();
	}
	
}
