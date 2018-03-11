

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import java.sql.DriverManager;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


@WebServlet("/order")
public class order extends HttpServlet
{
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	/*try
	{
		PrintWriter o= response.getWriter();
	 Class.forName("com.mysql.jdbc.Driver");
	 Connection cn= DriverManager.getConnection("jdbc:mysql://localhost:3306/bookstore","root","root");
	 PreparedStatement ps= cn.prepareStatement("insert into order_details values(?,?,?,?,?,?)");
	   ps.setInt(1, Integer.parseInt(request.getParameter("t1")));
	   ps.setString(2, request.getParameter("t2"));
	   ps.setString(3, request.getParameter("t3"));
	   ps.setString(4, request.getParameter("t4"));
	   ps.setString(5, request.getParameter("t5"));
	   ps.setInt(6, Integer.parseInt(request.getParameter("t6")));
	 	 ps.executeUpdate();
	 	 o.print("Data inserted");
	 	
			 
	}
	catch(Exception e)
	{
		
	}*/
		Configuration cfg= new Configuration();
		cfg.configure("cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		Session session= factory.openSession();
		Transaction t= session.beginTransaction();
		Hibernateorder h= new Hibernateorder();
		h.setOrder_id(Integer.parseInt(request.getParameter("t1")));
		h.setCust_name(request.getParameter("t2"));
		h.setPh_no(request.getParameter("t3"));
		h.setAddr(request.getParameter("t4"));
		h.setOrder_date(request.getParameter("t5"));
		h.setQty(Integer.parseInt(request.getParameter("t6")));
		
		session.save(h);
		t.commit();
		session.close();
		System.out.println("Successfully saved");
	 response.sendRedirect("Thanks.jsp");
	
	 	
	}

	

}
