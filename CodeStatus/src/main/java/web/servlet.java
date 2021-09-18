
package web;

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
@WebServlet("/servlet")
public class servlet extends HttpServlet{
    
    protected void doPost(HttpServletRequest req , HttpServletResponse res) throws IOException{
        //Setting answer.
        res.setContentType("text/html;charser:UTF-8");
        PrintWriter out = res.getWriter();
        //user and user. 
        String user = "admin";
        String password = "4321";
        //get data of request.
        String reqUser     = req.getParameter("user");
        String reqPassword = req.getParameter("password");
        
        System.out.println(reqUser);
        System.out.println(reqPassword);
        //verifies if of user has permiso.
        if(user.equals(reqUser) && password.equals(reqPassword)){
            out.print("<p>Felicitaciones!!</p>");
            out.print(user);
            out.print(", Tiene privilegios de Usuario.");
            
        }else{
            res.sendError(HttpServletResponse.SC_UNAUTHORIZED,"Usuario sin privilegios.");
        }
        out.close();
        
    }
    
}
