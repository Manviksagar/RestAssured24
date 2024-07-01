package com.sag.appium.RestAssued1;

public class Posts {
	
	private String id;
	private String title;
	private String author;
	public Posts() {
		
	}

	@Override
	public String toString() {
		return "Posts{" +
				"id='" + id + '\'' +
				", title='" + title + '\'' +
				", author='" + author + '\'' +
				'}';
	}

	public Posts(String id, String title, String author) {
		super();
		this.id = id;
		this.title = title;
		this.author = author;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	

}
