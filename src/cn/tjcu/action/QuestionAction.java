package cn.tjcu.action;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.catalina.connector.Request;
import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

import cn.tjcu.entity.FindJob;
import cn.tjcu.entity.Question;
import cn.tjcu.service.FindJobService;
import cn.tjcu.service.QuestionService;

public class QuestionAction extends ActionSupport{
		private Question question;
		Question question1;

		private QuestionService questionService;
		
		
		public void setQuestionService(QuestionService questionService) {
			this.questionService = questionService;
		}

		//列表显示
		public String list() throws Exception {
			HttpServletRequest request = ServletActionContext.getRequest(); 
			List<Question> list = questionService.findAll();
			request.setAttribute("qlist", list);
			return "list";
		}
		
		//测试
		public String test() throws Exception{
			Date qdate = new Date();
			question.setQname("求和问题");
			question.setQcontent("求a+b的值");
			question.setQanswer("int a+b;");
			question.setQdate(qdate);
			questionService.saveQuestion(question);
			System.out.println(question.getQcontent());
			return "test";
		}
		
		//问题答案
		public String detail() throws Exception{
			question1=questionService.findQuestionById(question.getQid());
			return "question_detail";
		}
	
		
		

		public Question getQuestion() {
			return question;
		}

		public void setQuestion(Question question) {
			this.question = question;
		}

		public Question getQuestion1() {
			return question1;
		}

		public void setQuestion1(Question question1) {
			this.question1 = question1;
		}
		
}
