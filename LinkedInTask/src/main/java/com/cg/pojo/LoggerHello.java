package com.cg.pojo;
import org.apache.log4j.Logger;
public class LoggerHello {


	

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			System.setProperty("log4j.configurationFile","./path_to_the_log4j2_config_file/log4j2.xml");
	  Logger log=Logger.getLogger(LoggerHello.class.getName());
	  log.info("info");
	  log.debug("debug message");
	  log.error("error");
	  log.fatal("fatal message");
	  
		}

	}


