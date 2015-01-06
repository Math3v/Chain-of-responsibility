package main;

public class Main {
	
	private static ErrorHandler createChain(){
		ErrorHandler minor = new MinorErrorHandler(Severity.MINOR);
		ErrorHandler major = new MajorErrorHandler(Severity.MAJOR);
		ErrorHandler fatal = new FatalErrorHandler(Severity.FATAL);
		
		minor.setNext(major);
		major.setNext(fatal);
		
		return minor;
	}
	
	public static void main (String args[]){
		ErrorHandler handler = createChain();
		
		handler.error("This is minor error", Severity.MINOR);
		handler.error("This is major error", Severity.MAJOR);
		handler.error("This is fatal error", Severity.FATAL);
	}

}
