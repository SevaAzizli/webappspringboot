package webappspringboot.webappspringboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

@Controller
public class HomeController {


    @RequestMapping("home")
    public ModelAndView home(@RequestParam("name") String myname){

        System.out.println("Hi, "+myname);

        ModelAndView modelAndView = new ModelAndView(  );
        modelAndView.addObject( "nameAttribute" ,myname);
        modelAndView.setViewName( "home" );

        return modelAndView;
    }


}
