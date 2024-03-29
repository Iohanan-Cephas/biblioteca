package library;

import java.io.IOException;

public class BookException extends IOException {
	private static final long serialVersionUID = 1L;
	
	public BookException(String msg) {
		super(msg);
	}
}
