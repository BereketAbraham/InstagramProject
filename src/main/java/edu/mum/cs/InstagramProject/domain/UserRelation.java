package edu.mum.cs.InstagramProject.domain;

import java.util.ArrayList;
import java.util.List;

public class UserRelation {
	
	private List<Follower> followersList;
	private List<Following> followingsList;

	public UserRelation() {
		super();
		followersList = new ArrayList<>();
		followingsList = new ArrayList<>();
	}
	
	public void addFollower(Follower follower) {
		followersList.add(follower);
	}
	
	public void addFollowing(Following following) {
		followingsList.add(following);
	}
	
	public List<Follower> getFollowersList() {
		return followersList;
	}

	public void setFollowersList(List<Follower> followersList) {
		this.followersList = followersList;
	}

	public List<Following> getFollowingsList() {
		return followingsList;
	}

	public void setFollowingsList(List<Following> followingsList) {
		this.followingsList = followingsList;
	}

	@Override
	public String toString() {
		return "UserRelation [followerList=" + followersList.size() + ", followingList=" + followingsList.size() + "]";
	}

}
