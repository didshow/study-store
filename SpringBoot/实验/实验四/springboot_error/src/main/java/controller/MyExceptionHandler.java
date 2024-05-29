package controller;

import exception.UserNotExistException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;
@ControllerAdvice
public class MyExceptionHandler {
    @ExceptionHandler(UserNotExistException.class)
    public String handleException(Exception e, HttpServletRequest request) {
        Map<String, Object> map = new HashMap<>();
        //向 request 对象传入错误状态码
        request.setAttribute("javax.servlet.error.status_code",500);
        //根据当前处理的异常，自定义的错误数据
        map.put("code", "user.notexist");
        map.put("message", e.getMessage());
        //将自定的错误数据传入 request 域中
        request.setAttribute("ext",map);
        return "forward:/error";
    }
}
