package servlet;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * Serves member-specific pages (i.e. profile) that require login
 */

@WebServlet("/MemberAreaController")
public class MemberAreaController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public MemberAreaController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
		switch(action) {
		case "destroy":
			request.getSession().invalidate();
			response.sendRedirect("login.jsp");
			break;
		case "memberArea":
			request.getRequestDispatcher("profile.jsp").forward(request, response);
			break;
		case "settings":
			request.getRequestDispatcher("settings.jsp").forward(request, response);
		default:
			break;
		}	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}