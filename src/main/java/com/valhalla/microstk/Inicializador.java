package com.valhalla.microstk;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
  
public class Inicializador extends SpringBootServletInitializer {
  
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(MicroStkApplication.class);
	}
  
}
