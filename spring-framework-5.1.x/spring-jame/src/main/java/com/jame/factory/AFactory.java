package com.jame.factory;

import com.jame.pojo.A;

/**
 * @author : Jame
 * @date : 2022-04-14 20:46
 * @description :
 **/
public class AFactory {

	public AFactory() {
		System.out.println("AFactory created");
	}

	public  A getA(){
		return new A();

	}

}
