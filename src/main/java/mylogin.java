
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class mylogin extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        response.getWriter().println("<html><body>");
        response.getWriter().println("<h1>Contact Page</h1>");
        response.getWriter().println("<nav><a href='home.jsp'>Home</a> | <a href='about.jsp'>About</a> | <a href='contact.jsp'>Contact</a></nav>");
        response.getWriter().println("<form method='post' action='contact'>");
        response.getWriter().println("Name: <input type='text' name='name'><br>");
        response.getWriter().println("Email: <input type='text' name='email'><br>");
        response.getWriter().println("Message: <textarea name='message' rows='5' cols='40'></textarea><br>");
        response.getWriter().println("<input type='submit' value='Submit'>");
        response.getWriter().println("</form>");
        response.getWriter().println("</body></html>");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String message = request.getParameter("message");

        response.setContentType("text/html");
        response.getWriter().println("<html><body>");
        response.getWriter().println("<h1>Contact Page</h1>");
        response.getWriter().println("<nav><a href='home.jsp'>Home</a> | <a href='about.jsp'>About</a> | <a href='contact.jsp'>Contact</a></nav>");
        response.getWriter().println("<p>Thank you, " + name + ". We will contact you at " + email + ".</p>");
        response.getWriter().println("<p>Your message: " + message + "</p>");
        response.getWriter().println("</body></html>");
    }
}


//
//
//import java.io.IOException;
//import java.io.PrintWriter;
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
///**
// * Servlet implementation class mylogin
// */
//@WebServlet("/mylogin")
//public class mylogin extends HttpServlet {
//	private static final long serialVersionUID = 1L;
//
//    /**
//     * @see HttpServlet#HttpServlet()
//     */
//    public mylogin() {
//        super();
//        // TODO Auto-generated constructor stub
//    }
//
//	/**
//	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
//	 */
//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		response.setContentType("text/html");
//		PrintWriter pw = response.getWriter();
//		String username = request.getParameter("val1");
//		String password = request.getParameter("val2");
//		pw.println("Username = " + username);
//		pw.println("Password is " + password);
//		pw.close();
//	}
//
//}
