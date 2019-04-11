package edu.mum.cs.InstagramProject.domain;

import java.util.List;

public class Following {
	
	private Long id;
	private User user;
	private List<User> followingUsers;
	
	public Following(Long id, User user, List<User> followingUsers) {
		super();
		this.id = id;
		this.user = user;
		this.followingUsers = followingUsers;
	}

	public Long getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Following [id=" + id + ", user=" + user + ", followingUsers=" + followingUsers.size() + "]";
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

	public List<User> getFollowingUsers() {
		return followingUsers;
	}

	public void setFollowingUsers(List<User> followingUsers) {
		this.followingUsers = followingUsers;
	}

}
