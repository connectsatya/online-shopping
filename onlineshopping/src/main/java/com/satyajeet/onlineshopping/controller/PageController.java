package com.satyajeet.onlineshopping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.satyajeet.shoppingbackend.dao.CategoryDao;
import com.satyajeet.shoppingbackend.dto.Category;

@Controller
public class PageController {
	
	@Autowired
	private CategoryDao categoryDAO;
	
	@RequestMapping(value={"/","/home","/index"})
	public ModelAndView index(){
		ModelAndView mv=new ModelAndView("page");
		mv.addObject("categories", categoryDAO.list());
		mv.addObject("title", "Home");
		mv.addObject("userClickHome", true);
		return mv;
	}
	@RequestMapping("/about")
	public ModelAndView about(){
		ModelAndView mv=new ModelAndView("page");
		mv.addObject("title", "About Us");
		mv.addObject("userClickAbout", true);
		return mv;
	}
	@RequestMapping("/contact")
	public ModelAndView contact(){
		ModelAndView mv=new ModelAndView("page");
		mv.addObject("title", "Contact Us");
		mv.addObject("userClickContact", true);
		return mv;
	}
	
	/*Methods to load all products based on category
	 * */
	@RequestMapping("/show/all/products")
	public ModelAndView showAllProducts(){
		ModelAndView mv=new ModelAndView("page");
		mv.addObject("categories", categoryDAO.list());
		mv.addObject("title", "All Produts");
		mv.addObject("userClickAllProducts", true);
		return mv;
	}
	@RequestMapping("/show/category/{id}/products")
	public ModelAndView showCategoryProducts(@PathVariable("id") int id){
		ModelAndView mv=new ModelAndView("page");
		//categoryDAO to fetch a single category
		Category category=null;
		category=categoryDAO.get(id);
		 //passing the list of categories 
		mv.addObject("categories", categoryDAO.list());
		mv.addObject("title",category.getName());
		//passig single category products
		mv.addObject("category", category);
		mv.addObject("userClickCategoryProducts", true);
		return mv;
	}
}
