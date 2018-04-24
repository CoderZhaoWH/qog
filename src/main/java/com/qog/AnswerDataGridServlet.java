package com.qog;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletInputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.qog.util.Constant;
import com.qog.util.DESede;
import com.qog.util.WebUtil;

public class AnswerDataGridServlet extends HttpServlet {
	private AnswerService answerService;

	public AnswerDataGridServlet() {
	}

	public void init(ServletConfig config) throws ServletException {

		WebApplicationContext ctx = WebApplicationContextUtils.getWebApplicationContext(config.getServletContext());
		answerService = (AnswerService) ctx.getBean("answerService");
	}

	public void destroy() {

		super.destroy();
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("信息：方法【SurveyDataGridServletdoGet】开始！");
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("信息：方法【SurveyDataGridServletdoPost】开始！");
		/*
		 * 获取消息实体内容
		 */

		/*
		 * ServletInputStream sis = request.getInputStream(); String
		 * filepathString =
		 * request.getServletContext().getRealPath("/WEB-INF/upload/body.out");
		 * int length = request.getContentLength();
		 * 
		 * System.out.println(length); System.out.println(filepathString);
		 * 
		 * FileOutputStream fos = new FileOutputStream(filepathString); byte[]
		 * buf = new byte[length];
		 * 
		 * for (int read = 0, reading = 0; read < length; read = read + reading)
		 * { reading = sis.read(buf, read, length - read); }
		 * 
		 * fos.write(buf, 0, length); fos.close(); sis.close();
		 */
		String username = WebUtil.getParam(request, "title", null);
		String date_from = WebUtil.getParam(request, "date_from", null);
		String date_to = WebUtil.getParam(request, "date_to", null);
		System.out.println(username + "" + date_from + "" + date_to);

		String pageSize = WebUtil.getParam(request, "rows", null);
		String pageNumber = WebUtil.getParam(request, "page", null);
		String sort = WebUtil.getParam(request, "sort", null);
		String order = WebUtil.getParam(request, "order", null);

		WebUtil.respondStrict(request, response, answerService.retPagination(username, date_from, date_to, pageSize, pageNumber, sort, order));
	}
}
