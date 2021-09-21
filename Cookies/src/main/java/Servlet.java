
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
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
        boolean user = true;
        //Setting answer.
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        //Get Cookies
        Cookie[] cookies = request.getCookies();
        //Check if there is cookies stored.
        if(cookies != null){
            //Read each value of the cookies
            for(Cookie c: cookies){
                //if find a name cookie same "frequent" and value same "yes"
                if(c.getName().equals("frequent") && c.getValue().equals("yes")){
                    
                    user = false;
                    break;
                }
            }
        }
        
        String mensaje = null;
        //If user is true create a new cookie.
        if(user){
            Cookie frequentCookie = new Cookie("frequent","yes");
            response.addCookie(frequentCookie);
            mensaje = "Gracias por visitar nuestro sitio por primera vez";
        }
        else{
            mensaje = "Gracias por preferir nuestro sitio.";
        }
        
        
        out.print(mensaje);
        out.close();
        
        
    }
    
}
