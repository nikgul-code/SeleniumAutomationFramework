package com.practice.qa.utils;



public class environmentVariables 
{
	
	
	
      public environmentVariables() 
      {
		
	  }
      
      
     
      
      public static String baseURL(String env)
      {
    	    	  
    	  return switch (env) {
    	  case "dev" -> "http://localhost:90/finsys/";
    	  
    	  default -> "http://localhost:90/finsys/";
    	  
    	  };
    	  
				
		}
      }

