package controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import pojo.UserForm;
import service.UserService;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/index")
public class UserController {
    private static final Log logger = LogFactory.getLog(UserController.class);
    @Autowired
    public UserService userService;

    /**
     * 处理登录
     * @param user
     * @param session
     * @param model
     * @return
     */
    @RequestMapping("/login")
    public String login(UserForm user, HttpSession session, Model model){
        if("zhangsan".equals(user.getUname())&&"123456".equals(user.getUpass())){
            session.setAttribute("u",user);
            logger.info("成功");
            return "main";
        }else {
            logger.info("失败");
            model.addAttribute("messageError","用户名或密码错误");
            return "login";
        }
    }

    /**
     * 处理注册
      * @param user
     * @return
     */
    @RequestMapping("/register")
    public String register(@ModelAttribute("user") UserForm user){
        if("zhangsan".equals(user.getUname())&&"123456".equals(user.getUpass())){
            logger.info("成功");
            return "login";
        }else{
            logger.info("失败");
            return "register";
        }
    }
}
