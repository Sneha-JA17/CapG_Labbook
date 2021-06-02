package com.Capgemini.bookapp.model;

public class BookIDCannotBeNegative extends Exception {
	private static final long serialVersionUID = 1L;

	public BookIDCannotBeNegative(String s) {
		super(s);
	}
}
