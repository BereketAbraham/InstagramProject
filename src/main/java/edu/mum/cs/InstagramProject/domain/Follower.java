package edu.mum.cs.InstagramProject.domain;

import java.util.List;

public class Follower {
	
	private Long id;
	private User user;
	private List<User> userFollowers;
	
	public Follower(Long id, User user, List<User> userFollowers) {
		super();
		this.id = id;
		this.user = user;
		this.userFollowers = userFollowers;
	}

	@Override
	public String toString() {
		return "Follower [id=" + id + ", user=" + user + ", userFollowers=" + userFollowers.size() + "]";
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<User> getUserFollowers() {
		return userFollowers;
	}

	public void setUserFollowers(List<User> userFollowers) {
		this.userFollowers = userFollowers;
	}

}
