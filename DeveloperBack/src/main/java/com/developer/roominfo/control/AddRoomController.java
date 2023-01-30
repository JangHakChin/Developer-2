package com.developer.roominfo.control;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.developer.control.Controller;
import com.developer.exception.FindException;
import com.developer.roominfo.service.RoomInfoService;
import com.developer.roominfo.vo.RoomInfoVO;
import com.fasterxml.jackson.databind.ObjectMapper;

public class AddRoomController implements Controller {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// http://localhost:8888/Developer/roominfo/addroom
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		response.setContentType("application/json;charset=UTF-8");
		response.addHeader("Access-Control-Allow-Origin", "*");

		
		int srSeq = Integer.parseInt(request.getParameter("srSeq"));
		String name = request.getParameter("name");
		String info = request.getParameter("info");
		String imgPath = request.getParameter("imgPath");
		int person = Integer.parseInt(request.getParameter("person"));
		int price = Integer.parseInt(request.getParameter("price"));

		RoomInfoService service = new RoomInfoService();
		ObjectMapper mapper = new ObjectMapper();
		try { 
			service.addRoom(new RoomInfoVO(0, srSeq, name, info, imgPath, person, price, null));
		} catch (FindException e) {
			e.printStackTrace();
			Map<String, String> map = new HashMap<>();
			map.put("msg", e.getMessage());
			String jsonStr = mapper.writeValueAsString(map);
			return jsonStr;
		}
		return null;

	}
}
