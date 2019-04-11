package edu.mum.cs.InstagramProject.domain;

import java.util.List;

public class Post {
	
	private Long id;
	private String title;
	private String mediaUrl;
	private List<User> likes;
	private List<String> comments;

	public Post() {
		super();
	}

	public Post(Long id, String title, String mediaUrl) {
		super();
		this.id = id;
		this.title = title;
		this.mediaUrl = mediaUrl;
	}
	
	public void addLike(User user) {
		likes.add(user);
	}
	
	public int getNumberOfLikes() {
		return likes.size();
	}
	
	public void addComment(String comment) {
		comments.add(comment);
	}
	
	public int getNumberOfComments() {
		return comments.size();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getMediaUrl() {
		return mediaUrl;
	}

	public void setMediaUrl(String mediaUrl) {
		this.mediaUrl = mediaUrl;
	}

	public List<User> getLikes() {
		return likes;
	}

	public void setLikes(List<User> likes) {
		this.likes = likes;
	}

	public List<String> getComments() {
		return comments;
	}

	public void setComments(List<String> comments) {
		this.comments = comments;
	}

	@Override
	public String toString() {
		return "Post [id=" + id + ", title=" + title + ", mediaUrl=" + mediaUrl + ", likes=" + likes.size() + ", comments="
				+ comments.size() + "]";
	}

}
