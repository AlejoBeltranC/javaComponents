
package web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author alejo
 */
@WebServlet("/infoservlet")
public class servlet extends HttpServlet{
    
    @Override
    protected void doGet(HttpServletRequest req , HttpServletResponse res) throws IOException{
        //answer type. 
        res.setContentType("text/html;charset=UTF-8");
        //answer setting.
        PrintWriter out = res.getWriter();
        
        //get metadata of request.
        String method = req.getMethod();
        String uri    = req.getRequestURI();
        Enumeration info = req.getHeaderNames();
        
        
        //answer
        out.print("<html>");
        out.print("<head>");
        out.print("<title> Cabeceros </title>");
        out.print("</head>");
        out.print("<body>");
        out.print("<h1>Informacion sobre cabeceros.</h1>");
        out.print("<p>Método utilizado la petición http</p>");
        out.print(method);
        out.print("<p>Información uri.</p>");
        out.print(uri);
        out.print("<p>Más información disponible:");
        out.print("<br>");
        while(info.hasMoreElements()){
            String name = (String) info.nextElement();
            out.print(name);
            String description = req.getHeader(name);
            out.print(description);
            out.print("<br>");
        }
        out.print("</body>");
        out.print("</html>");
        out.close();
    }
}
