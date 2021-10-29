package com.jame.pojo;


/**
 * @author : Jame
 * @date : 2021-10-26 09:20
 **/
public class CarFactory  {
	public CarFactory(){
		System.out.println("carFactory创建实例");
	}

	public static Car getCar(){
		return new Car();
	}
}
