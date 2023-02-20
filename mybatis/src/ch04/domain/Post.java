package ch04.domain;

public class Post {
	private String title;
	private String content;
	
	public Post(String title, String content) {
		this.title = title;
		this.content = content;
	}
	
	@Override
	public String toString() {
		return String.format("%s %s", title, content);
	}
}