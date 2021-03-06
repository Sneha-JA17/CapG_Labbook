package com.Capgemii.authorapp.Author.service;

import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import com.Capgemini.authorapp.Author.model.Author;




public class AuthorManage {
		Map<String, Author> authorList = new ConcurrentHashMap<String, Author>();

		public AuthorManage() {

		}

		

		public void addAuthor(String name, String email, char gender) {
			Author author = new Author(name, email, gender);

			validateAuthor(author);
			checkAuthorExists(author);
			authorList.put(generateKey(author),author);
		}

		private String generateKey(Author author) {
			return String.format("%s-%s", author.getName(), author.getEmail());
		}

		private void checkAuthorExists(Author author) {
			if(authorList.containsKey(generateKey(author)))
				throw new RuntimeException("Author already exists");
			
		}

		private void validateAuthor(Author author) {
			author.validateName();
			author.validateEmail();
			author.validateGender();
		}
		
		public Collection<Author> getAllAuthors() {
			return authorList.values();
		}
}