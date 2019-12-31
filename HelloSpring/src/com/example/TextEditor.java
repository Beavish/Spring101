package com.example;

public class TextEditor {
	private SpellChecker spellChecker;
	   
	   // a setter method to inject the dependency.
	  // 
	   public void setSpellChecker(SpellChecker spellChecker) {
	      System.out.println("Inside setSpellChecker." );
	      this.spellChecker = spellChecker;
	   }
	   
	   // a getter method to return spellChecker
	   public SpellChecker getSpellChecker() {
	      return spellChecker;
	   }
	   
	   // call the method without instatiating the object as it is injected via
	   // Spring Container BEANS.xml `application context`
	   public void spellCheck() {
	      spellChecker.checkSpelling();
	   }

}
