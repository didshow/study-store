package controller;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 *  切面类，在此类中编写各种类型的通知
 */
@Component  // 让此切面成为Spring容器管理的Bean
@Aspect // 声明一个切面
public class MyAspect {

    /**
     * 定义切入点，通知增强哪些方法
     * execution(* aspectj.dao *.*(..))是定义切入点表达式，
     * 该表达式的意思是匹配aspect.dao包中任意类的任意方法的执行；
     * 其中exection（）是表达式的主体，
     * 第一个*表示的是返回类型，使用*代表所有类型。
     * aspectj.dao表示的是需要匹配的包名，
     * 后面第二个*表示的是类名，使用*代表匹配包中所有的类
     * 第三个*表示的是方法名，使用*表示所有方法；
     * 后面（..）表示方法的参数，其中..表示任意参数
     * 注意：第一个*与包名之间有一个空格
     */

    @Pointcut("execution(* controller.*.*(..))")
    private void myPointCut(){

    }

    //前置通知，使用JointPoint接口作为参数获得目标对象的信息
    @Before("myPointCut()")
    public void before(JoinPoint jp){
        System.out.print("前置通知：模拟权限控制");
        System.out.println("目标类对象："+jp.getTarget()+",被增强处理的方法"+jp.getSignature().getName());
    }


    //后置返回通知
    @AfterReturning("myPointCut()")
    public void afterReturning(JoinPoint jp){
        System.out.print("后置返回通知：" + "模拟删除临时文件");
        System.out.println(",被增强处理的方法："+jp.getSignature().getName());

    }

    /**
     *
     * 环绕通知
     * ProceedingJoinPoint是JoinPoint子接口，代表可以执行的目标方法
     * 返回值类型必须是Object
     * 必须一个参数是ProceedingJoinPoint类型
     * 必须throws throwable
     */

    @Around("myPointCut()")
    public Object aroud(ProceedingJoinPoint pjp) throws Throwable {
       //开始
        System.out.println("环绕开始：执行目标方法前，模拟开启事务");
        //执行当前目标方法
        Object obj = pjp.proceed();
        //结束
        System.out.println("环绕结束：执行目标方法后，模拟关闭事务");

        return obj;
    }

   // 异常通知
    @AfterThrowing(value = "myPointCut()",throwing = "e")
    public void execpt(Throwable e){
        System.out.println("异常通知："+"程序执行异常"+e.getMessage());
    }

    //后置（最终通知）
    @After("myPointCut()")
    public void after(){
        System.out.println("最终通知：模拟释放资源");

    }


}
