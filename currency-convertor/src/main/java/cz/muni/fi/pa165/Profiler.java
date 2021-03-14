package cz.muni.fi.pa165;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

@Aspect

public class Profiler {

    @Around("execution(public * cz.muni.fi.pa165.currency.CurrencyConvertorImpl.*(..))")
    public Object profile(ProceedingJoinPoint call) throws Throwable {
        StopWatch clock = new StopWatch("Profilovani " + call.toShortString());
        try {
            clock.start(call.toShortString());
            return call.proceed();
        } finally {
            clock.stop();
            System.out.println(clock.prettyPrint());
        }
    }
}
