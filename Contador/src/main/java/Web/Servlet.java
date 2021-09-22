
package Web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
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
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException{
        Cookie[] cookie;
        //Setting answer.
        res.setContentType("text/html;charset=UTF-8");
        PrintWriter out = res.getWriter();
        //ViewsNumber.
        int count = 0;
        //get request cookies.        
        cookie = req.getCookies();
        //Check if contains the views cookie.
        if(cookie != null){
            for (Cookie c:cookie){
                if (c.getName().equals("Views")){
                    count = Integer.parseInt(c.getValue());
                }
            }
        }
        //count += 1
        count += 1;
        //Setting Response Cookie
        Cookie c = new Cookie("Views",Integer.toString(count));
        res.addCookie(c);
        //Aswer
        out.print("Has visitado esta pagina");
        out.print(count);
    }
    
}
