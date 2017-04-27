package cn.tjcu.action;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.catalina.connector.Request;
import org.apache.struts2.ServletActionContext;
import com.opensymphony.xwork2.ActionSupport;
import cn.tjcu.entity.EnglishLearning;
import cn.tjcu.service.EnglishLearningService;
public class EnglishLearningAction extends ActionSupport{
		public EnglishLearning english;
		private EnglishLearning english1;
		private EnglishLearningService englishLearningService;
		public void setEnglishLearningService(EnglishLearningService englishLearningService) {
			this.englishLearningService = englishLearningService;
		}
		
		//¡–±Ìœ‘ æ
		public String list() throws Exception {
			HttpServletRequest request = ServletActionContext.getRequest(); 
			List<EnglishLearning> list = englishLearningService.findAll();
			request.setAttribute("elist", list);
			return "list";
		}
		public String test() throws Exception{
			Date edate = new Date();
			english.setEname("test1");
			english.setEcontent("englishContenttest1");
			english.setEdate(edate);
			englishLearningService.saveEnglish(english);
			System.out.println(english.getEcontent());
			return "test";
		}
		
		public String detail(){
			english1 = englishLearningService.findEnglishById(english.getEid());
			return "detail";
		}
		
		
		
		public EnglishLearning getEnglish() {
			return english;
		}

		public void setEnglish(EnglishLearning english) {
			this.english = english;
		}

		public EnglishLearning getEnglish1() {
			return english1;
		}
		public void setEnglish1(EnglishLearning english1) {
			this.english1 = english1;
		}
		
	
}
