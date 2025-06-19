package Demo1Package1;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;


@WebServlet("/calculate")
public class Calculater extends GenericServlet  {
	private static final long serialVersionUID = 1L;
       
  
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
	
		long num1 = Integer.parseInt(request.getParameter("num1"));
		long num2 = Integer.parseInt(request.getParameter("num2"));
		System.out.println(num1);
		response.setContentType("text/html");
		String option = request.getParameter("s1");
		PrintWriter pw = response.getWriter();
		pw.print("<html><body style='background-color:green' text='red'></body></html>");
		if(option.equals("+"))
		{
			pw.print("Sum of two number: "+(num1+num2));
		}
		else if(option.equals("-"))
		{
			pw.print("subtraction: "+((num1)-(num2)));
		}
		else if(option.equals("*"))
		{
			pw.print("multiplication: "+(num1)*(num2));
		}
		else if(option.equals("/"))
		{
			pw.print("divition: "+(num1/num2));	
		}
//		else
//		{
//			
//		}
		//pw.print("");

	pw.close();
	}
	

}
