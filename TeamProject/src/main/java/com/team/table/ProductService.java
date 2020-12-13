package com.team.table;

import java.util.List;

public interface ProductService {

	public int insertProduct(ProductVO vo);
	public int deleteProduct(int sid);
	public int updateProduct(ProductVO vo);
	public ProductVO getProduct(int sid);
	public List<ProductVO> getProductList();
}
