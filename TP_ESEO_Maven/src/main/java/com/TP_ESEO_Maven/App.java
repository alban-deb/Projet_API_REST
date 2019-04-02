package com.TP_ESEO_Maven;

import org.springframework.boot.SpringApplication;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	try {
			SpringApplication.run(App.class,args);
			System.out.println("Application démarrée");
		}catch (Exception e) {
			System.out.println();
		}
    }
}
