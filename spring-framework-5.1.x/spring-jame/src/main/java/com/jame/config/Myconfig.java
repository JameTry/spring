package com.jame.config;

import com.jame.pojo.A;
import com.jame.pojo.B;
import com.jame.pojo.C;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * @author: Jame
 * @date: 2020/12/3 10:27
 * @description:
 */


//@ComponentScan("com.jame")
@Configuration
//@Component
public class Myconfig {

	@Bean
	public A getA(){
 		System.out.println("执行getA");
		return new A();
	}

	@Bean
	public B getB(A a){
		System.out.println("执行getB");
		System.out.println(a);
		B b = new B();
		b.setA(a);
		return b;
	}

	@Bean
	public C getC(A a){
		System.out.println("执行getC");
		System.out.println(a);
		C c = new C();
		c.setA(a);
		return c;
	}
}
