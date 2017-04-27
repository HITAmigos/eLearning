package cn.tjcu.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import com.opensymphony.xwork2.ActionSupport;
import cn.tjcu.entity.StudyWeb;
import cn.tjcu.service.StudyWebService;
public class StudyWebAction extends ActionSupport{
		public StudyWeb studyWeb=new StudyWeb();
		
		private StudyWebService studyWebService;
		
		public void setStudyWebService(StudyWebService studyWebService) {
			this.studyWebService = studyWebService;
		}
		public String list() throws Exception {
			HttpServletRequest request = ServletActionContext.getRequest(); 
			List<StudyWeb> list = studyWebService.findAll();
			request.setAttribute("wlist", list);
			return "list";
		}
		public String test() throws Exception{
			studyWeb.setWname("大学生慕课网");
			studyWeb.setWdescription("大学课程网");
			studyWeb.setWaddress("www.icourse163.org");
			System.out.println(studyWeb.getWdescription());
			studyWebService.saveStudyWeb(studyWeb);
			return "test";
		}
	
}
