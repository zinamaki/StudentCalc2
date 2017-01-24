package ctrl;

import java.io.IOException;
import java.io.Writer;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Start
 */
@WebServlet({ "/Start", "/Startup", "/Startup/*" })
public class Start extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Start() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
				
		
		response.setContentType("text/plain");
		Writer resOut = response.getWriter();
		resOut.write("Hello, World!\n");

		String clientIP = request.getRemoteAddr();
		resOut.write("Client IP: " + clientIP + "\n");
		
		int port = request.getLocalPort();
		resOut.write("Port: " + port + "\n");

		String protocol = request.getProtocol();
		resOut.write("Protocol: " + protocol + "\n");

		String method = request.getMethod();
		resOut.write("Method: " + method + "\n");

		String clientQueryString = request.getQueryString();
		resOut.write("Query string: " + clientQueryString + "\n");

		String default_principal = this.getServletContext().getInitParameter("principal");
		resOut.write("Param principal=" + default_principal + "\n");

		String default_period = this.getServletContext().getInitParameter("period");
		resOut.write("Param period" + default_period + "\n");

		String default_interest = this.getServletContext().getInitParameter("interest");
		resOut.write("Param interest=" + default_interest + "\n");

		String input_principal = request.getParameter("principal");
		String input_interest = request.getParameter("interest");
		String input_period = request.getParameter("period");

		if (input_principal == null) {
			input_principal = default_principal;
		}
		if (input_interest == null) {
			input_interest = default_interest;
		}
		if (input_period == null) {
			input_period = default_period;
		}

		Double r = Double.parseDouble(input_interest);
		Double A = Double.parseDouble(input_principal);
		Double n = Double.parseDouble(input_period);

		double calculation = ((r / 12) * A) / (1 - Math.pow(1 + (r / 12), -n));

		resOut.write("Calculation: " + calculation + "\n");

		String url = request.getRequestURL().toString();
		resOut.write("URL: " + url + "\n");

		String uri = request.getRequestURI().toString();
		resOut.write("URI: " + uri + "\n");

		String context = request.getContextPath();
		resOut.write("Context: " + context + "\n");

		String extraPath = request.getServletPath();
		resOut.write("Servlet/Extra path: " + extraPath + "\n");

		if (uri.endsWith("/Startup/YorkBank")) {
			response.sendRedirect(this.getServletContext().getContextPath() + "/Start");
		}
		// int a = 1/0;
		response.getWriter().append("Served at: ").append(request.getContextPath());
		System.out.println("Hello, Got a GET request!");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
