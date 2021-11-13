package com.jame.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author : Jame
 * @date : 2021-11-11 15:35
 **/

public class MyConfig2 {

	@Bean
	public Myconfig getMyConfig(){
		return new Myconfig();
	}
}
