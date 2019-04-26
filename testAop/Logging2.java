package testAop;
import org.aspectj.lang.annotation.*;

@Aspect
public class Logging2 {
    @Pointcut("execution(* testAop.Student.*(..))")
    private void selectAll(){}

    @Before("selectAll()")
    public void beforeAdvice(){
        System.out.println("aop: before advice");
    }

    @After("selectAll()")
    public void afterAdvice(){
        System.out.println("aop: after advice");
    }

    @AfterReturning(pointcut="selectAll()", returning="retVal")
    public void afterReturningAdvice(Object retVal){
        System.out.println("aop: afterReturning advice, retVal = " + retVal.toString());
    }
}
