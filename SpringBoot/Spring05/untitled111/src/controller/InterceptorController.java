package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class InterceptorController {
    @RequestMapping(value = "/testInterceptor")
    public  ModelAndView testInterceptor(){
        ModelAndView mv = new ModelAndView("anno");
        mv.addObject("msg", "注解驱动的mvc");
        return mv;
    }
}
