package main;

public class MinorErrorHandler extends ErrorHandler {
	
	public MinorErrorHandler(Severity severity){
		super(severity);
	}

	@Override
	protected void handleError(String error) {
		System.out.println("MINOR HANDLER: " + error);
	}

}
