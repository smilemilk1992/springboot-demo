package com.sohu.springbootdemo.AopTest;



import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.aspectj.lang.annotation.*;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

/**
 * @author haochen
 * @date 2019/7/30 10:45
 * @Aspect 表明是一个切面类
 * @Component 将当前类注入到Spring容器内
 * @Pointcut 切入点，其中execution用于使用切面的连接点。使用方法：execution(方法修饰符(可选) 返回类型 方法名 参数 异常模式(可选)) ，可以使用通配符匹配字符，*可以匹配任意字符。
 * @Before 在方法前执行
 * @After 在方法后执行
 * @AfterReturning 在方法执行后返回一个结果后执行
 * @AfterThrowing 在方法执行过程中抛出异常的时候执行
 * @Around 环绕通知，就是可以在执行前后都使用，这个方法参数必须为ProceedingJoinPoint，proceed()方法就是被切面的方法，上面四个方法可以使用JoinPoint，JoinPoint包含了类名，被切面的方法名，参数等信息。
 */

//@Aspect
//@Component
public class AopConfig {
    private static final Logger logger = LoggerFactory.getLogger(AopConfig.class);

//    @Pointcut("execution(public * com.sohu.springbootdemo.controller.*.*(..))")
    @Pointcut("execution(public * com.sohu.springbootdemo.controller.TestController.getGoodreadsInfo())")
    public void AopConfig(){}

    @Pointcut("execution(public * com.sohu.springbootdemo.controller.TestController.getinfo(..))")
    public void AopGetinfo(){}

    /**
     * 在方法前执行
     * @param joinPoint
     */
    @Before("AopGetinfo()")
    public void doBefore(JoinPoint joinPoint){
        // 接收到请求，记录请求内容
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();
        String requestUrl = request.getRequestURL().toString();
        String requestParam = request.getQueryString();
        String httpMethod = request.getMethod();
        String requestIp = request.getRemoteAddr();
        String requestClassMethod = joinPoint.getSignature().getDeclaringTypeName() + "." + joinPoint.getSignature().getName();
        logger.info("请求url："+requestUrl+" 请求参数："+requestParam+" 请求方法："+httpMethod+" 请求ip："+requestIp+" 请求方法类："+requestClassMethod);
    }

    /**
     * 在方法执行后运行
     * @param joinPoint
     */
    @After("AopGetinfo()")
    public void doAfter(JoinPoint joinPoint){
        System.out.println("doAfter");
    }

    /**
     * 在方法执行后返回一个结果后执行
     * @param response
     */
    @AfterReturning(returning = "response",pointcut = "AopConfig()")
    public void doAfterReturning(Object response){
        if (response != null) {
            System.out.println("response parameter : " + response);
        }
    }

    /**
     * 在方法执行过程中抛出异常的时候执行
     * @param joinPoint
     */
    @AfterThrowing(value = "AopGetinfo()",throwing="throwable")
    public void deAfterThrowing(JoinPoint joinPoint,Throwable throwable){
        System.out.println("deAfterThrowing="+joinPoint+" error="+throwable);
    }

    /**
     * 获取环绕的值
     * @param joinPoint
     * @return
     * @throws Throwable
     */
    @Around("AopGetinfo()")
    public Object deAround(ProceedingJoinPoint joinPoint) throws Throwable{
        Long start = System.currentTimeMillis();
        Object o = joinPoint.proceed();
        Long end = System.currentTimeMillis();
        logger.info("请求结果是 :{}  耗时(ms):{}",o,(end-start));
        return o;
    }

}


