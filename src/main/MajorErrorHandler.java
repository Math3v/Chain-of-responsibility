package main;

public class MajorErrorHandler extends ErrorHandler {
	
	public MajorErrorHandler(Severity severity){
		super(severity);
	}

	@Override
	protected void handleError(String error) {
		System.out.println("MAJOR HANDLER: " + error);
	}

}
