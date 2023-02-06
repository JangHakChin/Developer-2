package com.developer.users.control;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONObject;

import com.developer.control.Controller;
import com.developer.exception.FindException;
import com.developer.users.service.UsersService;
import com.developer.users.vo.UsersVO;
import com.fasterxml.jackson.databind.ObjectMapper;

public class CheckUserIdController implements Controller {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		response.setContentType("application/json;charset=UTF-8");
		response.addHeader("Access-Control-Allow-Origin", "*");


		UsersService service = new UsersService();
		String userId = request.getParameter("userId");
		ObjectMapper mapper = new ObjectMapper();
		try {
			UsersVO vo = service.getUsers(userId);
			boolean flag = false;
			String msg = null;
			
			
			//JSONObject obj = new JSONObject();
			//obj.put("userId", vo.getUserId());
//			String jsonStr = mapper.writeValueAsString(vo);
			if (vo == null) {
				msg = "사용 가능한 아이디";
				flag = true;
			} else if (vo !=null){
				msg = "사용 불가능한 아이디";
				flag = false;
			}
			JSONObject obj = new JSONObject();
			obj.put("flag", flag);
			obj.put("msg", msg);
			String txt = obj.toJSONString();
			return txt;
		} catch (FindException e) {
			e.printStackTrace();
			Map<String, String> map = new HashMap<>();
			map.put("msg", e.getMessage());
			String jsonStr = mapper.writeValueAsString(map);
			return jsonStr;
		}
//수정예정
		
	}

}
