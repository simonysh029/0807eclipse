package web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class lotto extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public lotto() {
		super();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String number1 = request.getParameter("no.1");
		String number2 = request.getParameter("no.2");
		String number3 = request.getParameter("no.3");
		String number4 = request.getParameter("no.4");
		String number5 = request.getParameter("no.5");
		String number6 = request.getParameter("no.6");
		System.out.println(number1);
		System.out.println(number2);
		System.out.println(number3);
		System.out.println(number4);
		System.out.println(number5);
		System.out.println(number6);
	}

}