package main;

public class FatalErrorHandler extends ErrorHandler {

	public FatalErrorHandler(Severity severity) {
		super(severity);
	}

	@Override
	protected void handleError(String error) {
		System.out.println("FATAL HANDLER: " + error);
	}

}
