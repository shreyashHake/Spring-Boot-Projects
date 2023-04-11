package hitachi.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

//@Aspect : we can configure AOP also using XML file (spring02.xml). . .
public class LoggingAspect {
    public void loggingAdvice() {
        System.out.println("1. Run advice, using XML");
    }

    public void securityAdvice(){
        System.out.println("2. This is security advice.");
    }
}
