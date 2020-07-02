package cc.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import cc.entityclass.TerraceMes;
import dao.TerraceMesDao;

/**
 * Servlet implementation class TerMesServlet
 */
@WebServlet("/TerMesServlet")
public class TerMesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TerMesServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		
		String type = request.getParameter("type");	
		String bookId = request.getParameter("id");
		String author = request.getParameter("author");
		
		TerraceMesDao orderDao = new TerraceMesDao();
		
		if (type.equals("listterrace_mes")) {
			// 1 查询books
			List<TerraceMes> terraces = null;
			terraces = orderDao.queryTerraceMes();
			
			// 4 设置request.setAttribute
			request.setAttribute("terraces", terraces);
			
			// 5 请求包含include
			request.getRequestDispatcher("components/terrace_mes.jsp").include(request, response);
		} 
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
