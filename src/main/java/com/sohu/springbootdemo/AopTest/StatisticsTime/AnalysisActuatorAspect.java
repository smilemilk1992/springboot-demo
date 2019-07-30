package com.sohu.springbootdemo.AopTest.StatisticsTime;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

/**
 * @Override
 * public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
 *    Object result;
 *    try {
 *        //@Before
 *        result = method.invoke(target, args);
 *        //@After
 *        return result;
 *    } catch (InvocationTargetException e) {
 *        Throwable targetException = e.getTargetException();
 *        //@AfterThrowing
 *        throw targetException;
 *    } finally {
 *        //@AfterReturning
 *    }
 * }
 * 自定义方法日志
 * @annotation 可以作为注解加到特定的方法上，例如Spring的Transaction注解。
 * @author haochen
 * @date 2019/7/30 14:08
 */
@Aspect
@Component
public class AnalysisActuatorAspect {
    private static final Logger logger = LoggerFactory.getLogger(AnalysisActuatorAspect.class);

    ThreadLocal<Long> beginTime = new ThreadLocal<>();

    @Pointcut("@annotation(analysisActuator)")
    public void serviceStatistics(AnalysisActuator analysisActuator) {}

    /**
     * 也可以改变入参
     * @param joinPoint
     * @param analysisActuator
     */
    @Before("serviceStatistics(analysisActuator)")
    public void doBefore(JoinPoint joinPoint, AnalysisActuator analysisActuator) {
        // 记录请求到达时间
        beginTime.set(System.currentTimeMillis());
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();
        String requestUrl = request.getRequestURL().toString();
        String requestParam = request.getQueryString();
        String httpMethod = request.getMethod();
        String requestIp = request.getRemoteAddr();
        String requestClassMethod = joinPoint.getSignature().getDeclaringTypeName() + "." + joinPoint.getSignature().getName();
        logger.info(" 请求url："+requestUrl+" 请求参数："+requestParam+" 请求方法："+httpMethod+" 请求ip："+requestIp+" 请求方法类："+requestClassMethod+" 请求耗时(ms):"+(System.currentTimeMillis() - beginTime.get()));
    }

    @After("serviceStatistics(analysisActuator)")
    public void doAfter(JoinPoint joinPoint, AnalysisActuator analysisActuator) {
        // 接收到请求，记录请求内容
        System.out.println("--------"+joinPoint.getSignature());
    }

    /**
     * 在方法执行后返回一个结果后执行
     * @param response
     */
    @AfterReturning(returning = "response",pointcut = "serviceStatistics(analysisActuator)")
    public void doAfterReturning(Object response,AnalysisActuator analysisActuator){
        if (response != null) {
            System.out.println("response parameter : " + response);
        }
    }

    /**
     * 在方法执行过程中抛出异常的时候执行，如果方法内部try了就不显示了，没有的话会显示
     * @param joinPoint
     */
    @AfterThrowing(value = "serviceStatistics(analysisActuator)",throwing="throwable")
    public void deAfterThrowing(JoinPoint joinPoint, AnalysisActuator analysisActuator,Throwable throwable){
        System.out.println("deAfterThrowing="+throwable+" 请求方法="+(joinPoint.getSignature().getDeclaringTypeName() + "." + joinPoint.getSignature().getName()));
    }

    @Around("serviceStatistics(analysisActuator)")
    public Object deAround(ProceedingJoinPoint joinPoint, AnalysisActuator analysisActuator) throws Throwable{
        Long start = System.currentTimeMillis();
        Object o = joinPoint.proceed();
        Long end = System.currentTimeMillis();
        logger.info("请求结果是 :{}  耗时(ms):{}",o,(end-start));
        return o;
    }

}
