package webappspringboot.webappspringboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

@Controller
public class HomeController {


    @RequestMapping("home")
    public String home(@RequestParam("name") String myname, HttpSession session){

        System.out.println("Hi, "+myname);
       session.setAttribute( "nameAttribute",myname );
        return "home";
    }


}
