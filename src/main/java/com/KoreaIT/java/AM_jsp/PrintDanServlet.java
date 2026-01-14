package com.KoreaIT.java.AM_jsp;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/printDan")
public class PrintDanServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html;charset=UTF-8");

		String inputDan = request.getParameter("dan");
		String inputLimit = request.getParameter("limit");

		if (inputDan == null) {
			inputDan = "1";
		}
		
		if (inputLimit == null) {
			inputLimit = "1";
		}

		int dan = Integer.parseInt(inputDan);
		int limit = Integer.parseInt(inputLimit);

		response.getWriter().append(String.format("==%d단==<br>", dan));

		for (int i = 1; i <= limit; i++) {
			response.getWriter().append(String.format("%d * %d = %d<br>", dan, i, dan * i));
		}

	}

}
