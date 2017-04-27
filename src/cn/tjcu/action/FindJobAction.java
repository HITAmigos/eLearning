package cn.tjcu.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.catalina.connector.Request;
import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import cn.tjcu.entity.FindJob;
import cn.tjcu.service.FindJobService;

public class FindJobAction extends ActionSupport{
			private FindJob  job;
			FindJob job1;
			private FindJobService findJobService;
			
			public void setFindJobService(FindJobService findJobService) {
				this.findJobService = findJobService;
			}
			
			//生成列表
			public String list() throws Exception {
				HttpServletRequest request = ServletActionContext.getRequest(); 
				
				
				List<FindJob> list = findJobService.findAll();
				request.setAttribute("list", list);
				//request.setAttribute("list", list);
				for (FindJob findJob : list) {
					System.out.println(findJob.getJname());
				}
				//System.out.println("list");
				return "list";
			}
			//工作详情
			public String detail(){
				job1 = findJobService.findJobById(job.getJid());
				return "findJob_detail";
			}
			
			
			//搜索查询
			public String find(){
			HttpServletRequest request = ServletActionContext.getRequest(); 
			String search = request.getParameter("search");
			System.out.println("获取："+search);
			List<FindJob> list = findJobService.getJob(search);
			request.setAttribute("list", list);	
				return "find";
			}
		
	
	
	
	
	
			public FindJob getJob() {
				return job;
			}
			public void setJob(FindJob job) {
				this.job = job;
			}
			public FindJob getJob1() {
				return job1;
			}
			public void setJob1(FindJob job1) {
				this.job1 = job1;
			}
	
	
	
}
