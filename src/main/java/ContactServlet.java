
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ContactServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Process the form data as needed
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String message = request.getParameter("message");

        // Optionally log the data or handle it
        System.out.println("Received message from: " + name + " (" + email + ")");
        System.out.println("Message: " + message);

        // Forward to the thank you page
        request.getRequestDispatcher("thankyou.jsp").forward(request, response);
    }
}
