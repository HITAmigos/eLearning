package cn.tjcu.action;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import com.opensymphony.xwork2.ActionSupport;

import cn.tjcu.entity.Food;
import cn.tjcu.service.FoodService;
public class FoodAction extends ActionSupport{
		public Food food=new Food();
		private Food food1;
		private FoodService foodService;		
		public void setFoodService(FoodService foodService) {
			this.foodService = foodService;
		}
		
		public String list() throws Exception {
			HttpServletRequest request = ServletActionContext.getRequest(); 
			List<Food> list = foodService.findAll();
			request.setAttribute("flist", list);
			return "list";
		}
		public String test() throws Exception{
			Date date = new Date();
			food.setFname("佐客牛排");
			food.setFdescription("仅售52.9元！价值59元的佐客牛排自助餐厅59元牛排套餐,地址：滨海新区解放路大榕树以东巨川金海岸独一处2楼餐饮区");
			food.setUid(1);
			food.setFdate(date);
			food.setFimg("foodImg/niupai.png");
			foodService.saveFood(food);
			return "test";
		}

		
		public String detail(){
			food1=foodService.findFoodById(food.getFid());
			return "detail";
		}
		
		public Food getFood1() {
			return food1;
		}

		public void setFood1(Food food1) {
			this.food1 = food1;
		}
	
		
}
