package com.spring.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
//@Aspect ע���ʾ����һ������
//@Component ��ʾ����һ��bean,��Spring���й���
//@Around(value = "execution(* com.spring.service.TeacherService.*(..))") 
//��ʾ��com.spring.service.TeacherService������е����з��������������
@Aspect
@Component
public class LoggerAspect {
	@Around(value="execution(* com.spring.service.TeacherService.*(..))")
	public Object log(ProceedingJoinPoint joinPoint) throws Throwable {
		System.out.println("start log:" + joinPoint.getSignature().getName());
		Object object = joinPoint.proceed();
		// ���ǽ�����ĳ�����Ĺ��ܱ�֮֯������ִ�к��Ĺ��ܵĴ���
		System.out.println("end log:" + joinPoint.getSignature().getName());
		return object;

	}
}
