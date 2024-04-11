package org.tnsif.java.interfacepackage;

public interface Food {
	//constants - static and final
	 String whoAmI="I am eatable";
	
	 //methods - public abstract
	  String taste();
	  
	 
	
	  //its not accepting non abstract method - only static , defalut methods are allowed
	  String consume();
}
