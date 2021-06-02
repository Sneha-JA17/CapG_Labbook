package com.Capgemini.bookapp;

import com.Capgemini.bookapp.model.ArrayListIsNullException;
import com.Capgemini.bookapp.model.Book;
import com.Capgemini.bookapp.model.BookAlreadyFoundException;
import com.Capgemini.bookapp.model.BookIDCannotBeNegative;
import com.Capgemini.bookapp.model.BookNameCannotBeNull;
import com.Capgemini.bookapp.model.BookNotFoundException;
import com.Capgemini.bookapp.model.PriceIsNotValidException;
import com.Capgemini.bookapp.service.BookManagement;

public class BookMain {

public static void main(String[] args) throws BookIDCannotBeNegative, BookNameCannotBeNull, PriceIsNotValidException, BookAlreadyFoundException, ArrayListIsNullException, BookNotFoundException {
		
		BookManagement.manageBooks();
		
	}	


}
