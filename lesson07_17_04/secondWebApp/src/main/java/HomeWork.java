import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet("/homework")
public class HomeWork extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        HttpSession session = request.getSession();
        Integer counter = (Integer) session.getAttribute("counter");

        if (counter == null)
            counter = 1;
        else
            counter++;
        session.setAttribute("counter", counter);

        String customerName = request.getParameter("customer");
        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();

        if (customerName == null) {
            writer.write("Hello, No-name!" + "<br");

        } else {
            writer.write("Hello, " + customerName + "<br>");
            writer.write("The number of page visits is " + counter);
            writer.close();
        }
    }
}