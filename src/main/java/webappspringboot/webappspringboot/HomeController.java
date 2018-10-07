package webappspringboot.webappspringboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

@Controller
public class HomeController {


    @RequestMapping("home")
    public ModelAndView home(Alien theAlien){

        System.out.println("Hi, "+theAlien);

        ModelAndView modelAndView = new ModelAndView(  );
       modelAndView.addObject("nameAttribute", theAlien );
        modelAndView.setViewName( "home" );
        return modelAndView;
    }


}
