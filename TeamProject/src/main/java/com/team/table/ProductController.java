package com.team.table;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.team.table.ProductDAO;
import com.team.table.ProductVO;

@Controller
public class ProductController {

	
	@Autowired
	ProductService productService;
	
	//	/board/list
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String home(Model model) {
		//model.addAttribute("list", productService.getProductList());
		return "home";
	}
	@RequestMapping(value = "/ProductList", method = RequestMethod.GET)
	public String productboardlist(Model model) {
		//model.addAttribute("list", productService.getProductList());
		return "ProductList";
	}

	@RequestMapping(value = "/ProductExpl", method = RequestMethod.GET)
	public String productexpl(Model model) {
		//model.addAttribute("list", productService.getProductList());
		return "ProductExpl";
	}
	@RequestMapping(value = "/AddMember", method = RequestMethod.GET)
	public String addproduct() {
		return "AddMember";
	}
	@RequestMapping(value = "/AddMemberOk", method = RequestMethod.POST)
	public String addPostOK(ProductVO vo) {
		if(productService.insertProduct(vo) == 0) {
			System.out.println("데이터 추가 실패");
		}
		else
			System.out.println("데이터 추가 성공!!!");
		return "redirect:home";
	}
	@RequestMapping(value = "/editform/{id}", method = RequestMethod.GET)
	public String editProduct(@PathVariable("id") int id, Model model) {
		ProductVO productVO = productService.getProduct(id);
		model.addAttribute("u", productVO);
		return "editform";
	}
	@RequestMapping(value = "/editok", method = RequestMethod.POST)
	public String editPostOk(ProductVO vo) {
		if(productService.updateProduct(vo) == 0) {
			System.out.println("데이터 수정 실패");
		}
		else
			System.out.println("데이터 수정 성공!!!");
		return "redirect:list";
	}
	@RequestMapping(value = "/deleteok/{id}", method = RequestMethod.GET)
	public String deleteproductOk(@PathVariable("id") int id) {
		if(productService.deleteProduct(id) == 0) {
			System.out.println("데이터 삭제 실패");
		}
		else
			System.out.println("데이터 삭제 성공!!!");
		return "redirect:../list";
	}
}
