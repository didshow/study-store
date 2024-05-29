package controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pojo.UserForm;

import javax.servlet.http.HttpSession;

/**
 * Created by wangchao on 2021/11/25.
 */

@Controller
@RequestMapping("/user")
public class UserController {



    //得到一个用来记录日志的对象，这样打印信息的时候能够标记打印的是哪个类的信息
    private static  final Log logger = LogFactory.getLog(UserController.class);

    /**
     * 处理登录
     * 使用UserForm对象（实体bean）user接受登录页面提交的请求参数
     */
    //@ModelAttribute
    public void testmodelattibuteannotation() throws Exception{
        System.out.println("ModelAttribut mark ");
    }


    //@RequestMapping("/login")
    public String login(UserForm user){

        System.out.println("姓名："+user.getUname());
        System.out.println("密码："+user.getUpass());

        logger.info("登录");
        if("zhangsan".equals(user.getUname())&&"123456".equals(user.getUpass())){
            logger.info("成功");
            return "main";
        }else{
            logger.info("失败");
            return "login";
        }
    }

    /**
     *通过处理方法的形参接受请求参数
     *
     */
   // @RequestMapping("/login")
    public String login1(  String uname,String upass){
        logger.info(uname);
        logger.info(upass);

        logger.info("登录");
        if("zhangsan".equals(uname)&&"123456".equals(upass)){
            logger.info("成功");
            return "main";
        }else{
            logger.info("失败");
            return "login";
        }
    }

    /**
     *通过@RequestParam处理方法的形参接受请求参数
     *
     */
     @RequestMapping("/login")
    public String login2(@RequestParam(required = false) String uname,@RequestParam(required = false) String upass){
         logger.info(uname);
         logger.info(upass);
        logger.info("登录");
        if("zhangsan".equals(uname)&&"123456".equals(upass)){
            logger.info("成功");
            return "main";
        }else{
            logger.info("失败");
            return "login";
        }
    }

    /**
     *通过@RequestParam处理方法的形参接受请求参数
     *
     */
    // @RequestMapping("/login")
    public String login3(@ModelAttribute("user") UserForm user123){

         logger.info(user123.getUname());
         logger.info(user123.getUpass());
        logger.info("登录");
        if("zhangsan".equals(user123.getUname())&&"123456".equals(user123.getUpass())){
            logger.info("成功");
            return "forward:/user/register";
        }else{
            logger.info("失败");
            return "login";
        }
    }

    // @RequestMapping("/login")
     public String login5(){
         //转发到一个请求方法（同一个控制器类中，可省略/index/）
         return "forward:/index/isLogin";
     }

    // @RequestMapping("/isLogin")
    public String isLogin(){
        //重定向到一个请求方法
        return "redirect:/index/isRegister";
    }

    // @RequestMapping("/isRegister")
    public String isRegister(){
        //转发到一个视图
        return "register";
    }




    /**
     * 处理注册
     * 使用UserForm对象（实体bean）user接受注册页面提交的请求参数
     */
    @RequestMapping("/register")
    public String register(UserForm user){
        logger.info("注册");
        if("zhangsan".equals(user.getUname())&&"123456".equals(user.getUpass())){
            logger.info("成功");
            return "login";//注册成功，跳转到login.jsp
        }else{
            logger.info("失败");
            return "register"; //返回register.jsp
        }
    }


    /**
     * 通过处理方法的形参接受请求参数
     */
    //@RequestMapping("/register")
    public String register1(String uanme,String upass){
        logger.info("注册");
        if("zhangsan".equals(uanme)&&"123456".equals(upass)){
            logger.info("成功");
            return "login";//注册成功，跳转到login.jsp
        }else{
            logger.info("失败");
            return "register"; //返回register.jsp
        }
    }

    /**
     * 通过@RequestParam处理方法的形参接受请求参数
     */
    //@RequestMapping("/register")
    public String register2(@RequestParam String uanme,@RequestParam String upass){
        logger.info("注册");
        if("zhangsan".equals(uanme)&&"123456".equals(upass)){
            logger.info("成功");
            return "login";//注册成功，跳转到login.jsp
        }else{
            logger.info("失败");
            return "register"; //返回register.jsp
        }
    }

    /**
     * 处理注册
     * 使用UserForm对象（实体bean）user接受注册页面提交的请求参数
     */
    //@RequestMapping("/register")
    public String register3(@ModelAttribute("user")UserForm user){
        logger.info("注册");
        if("zhangsan".equals(user.getUname())&&"123456".equals(user.getUpass())){
            logger.info("成功");
            return "login";//注册成功，跳转到login.jsp
        }else{
            logger.info("失败");
            return "register"; //返回register.jsp
        }
    }
}
