package edu.mum.cs.InstagramProject.service;

import java.util.List;

import edu.mum.cs.InstagramProject.domain.Post;

public interface PostService {
	
	public Post getPost(Long postId);

	public Post savePost(Post post);

	public Post updatePost(Post post);

	public Post deletePost(Long postId);

	public List<Post> getPostList(Long profileId); 
	
}
