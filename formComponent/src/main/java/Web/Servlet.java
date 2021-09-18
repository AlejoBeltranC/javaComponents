
package Web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author alejo
 */
@WebServlet("/Servlet")
public class Servlet extends HttpServlet{
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException{
        //answer settings
        
        res.setContentType("text/html;charset=UTF-8");
        PrintWriter out =  res.getWriter();
        //get form's information.
        String name     = req.getParameter("userName");
        String lastName = req.getParameter("userLastName");
        /*String identification = req.getParameter("identification");
        String startDate   = req.getParameter("start");
        String endDate     = req.getParameter("end");
        String  people     = req.getParameter("people");
        String[] pets      = req.getParameterValues("pet");
        String comments    = req.getParameter("Comments");*/
        //answer
        out.print("<html>");
        out.print("<head>");
        out.print("<title>Confirmación</title>");
        out.print("</head>");
        out.print("<body>");
        out.print("<br>");
        out.print(name );
        out.print("<br>");
        out.print("Gracias por contactarnos, muy pronto le daremos respuesta.");
        out.print("</body>");
        out.print("</html>");
        
       
        
        
    }
    
    
}
