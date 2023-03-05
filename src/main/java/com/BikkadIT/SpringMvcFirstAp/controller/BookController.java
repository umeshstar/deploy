package com.BikkadIT.SpringMvcFirstAp.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.BikkadIT.SpringMvcFirstAp.model.Book;

@Controller
public class BookController {

	 @GetMapping("/usa")
	public ModelAndView getbookData() {
		Book book = new Book();
		book.setBookid(12);
		book.setBookName("b.l.thareje");
		book.setBookPrice(444.00);
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("BOOKS", book);
		mav.setViewName("book");
		
		
		
		return mav;
		
	}
	@GetMapping("/getAllbook")
	 public ModelAndView getAllbook() {
		Book book = new Book();
		book.setBookid(12);
		book.setBookName("som");
		book.setBookPrice(45544.00);

		Book book1 = new Book();
		book1.setBookid(132);
		book1.setBookName("l.electro");
		book1.setBookPrice(444.00);

		Book book2 = new Book();
		book2.setBookid(162);
		book2.setBookName("b.l");
		book2.setBookPrice(4544.00);

		 List<Book>books= new ArrayList<Book>();
		 books.add(book);
		 books.add(book1);
		 books.add(book2);
		 
		 ModelAndView mav= new ModelAndView();
		 mav.addObject("BOOKS", books);
		 mav.setViewName("books");
		 
		 
		 return mav;
		 
	 }
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
}
