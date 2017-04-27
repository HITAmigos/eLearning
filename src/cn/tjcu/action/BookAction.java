package cn.tjcu.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import com.opensymphony.xwork2.ActionSupport;

import cn.tjcu.dao.BookDao;
import cn.tjcu.entity.Book;
import cn.tjcu.service.BookService;
public class BookAction extends ActionSupport{
		public Book book=new Book();
		
		private BookService bookService;		

		public void setBookService(BookService bookService) {
			this.bookService = bookService;
		}
		
		public String list() throws Exception {
			HttpServletRequest request = ServletActionContext.getRequest(); 
			List<Book> list = bookService.findAll();
			request.setAttribute("blist", list);
			return "list";
		}
		public String test() throws Exception{
			book.setBname("计算机网络");
			book.setAuthor("谢希仁");
			book.setPrice(39);
			book.setBdescription("高校大学计算机网络教材");
			book.setBimg("bookImg/jiwang.jpg");
			bookService.saveBook(book);
			return "test";
		}
	
}
