package entities;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


public class Post {
	
	private LocalDateTime moment;
	private String title;
	private String content;
	private Integer likes;
	
	private List<Commente> comments = new ArrayList<>();
	
	public Post(){
		
	}
	public Post(LocalDateTime moment, String title, String content, Integer likes) {
		this.moment = moment;
		this.title = title;
		this.content = content;
		this.likes = likes;
	}
	
	public LocalDateTime getMoment() {
		return moment;
	}
	public void setMoment(LocalDateTime moment) {
		this.moment = moment;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Integer getLikes() {
		return likes;
	}
	public void setLikes(Integer likes) {
		this.likes = likes;
	}
	public String getContent() {
		return content;
	}
	public void addComent(Commente comment) {
		this.comments.add(comment);
	}
	public void removeComent(Commente comment) {
		this.comments.remove(comment);
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(this.title + "\n");
		sb.append(this.moment + "\n");
		sb.append(this.content + "\n");
		sb.append("Comments:\n");
		for (Commente commente : comments) {
			sb.append(commente.getText() + "\n");
		}
		return sb.toString();
	}
	
	
	
}
