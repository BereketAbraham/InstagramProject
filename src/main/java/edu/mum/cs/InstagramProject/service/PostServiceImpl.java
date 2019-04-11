package edu.mum.cs.InstagramProject.service;

import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;
import com.sun.javafx.UnmodifiableArrayList;
import edu.mum.cs.InstagramProject.domain.Post;

@Service
public class PostServiceImpl implements PostService {
	// we did this.. adding some data to posts list.. just for testng purpose. we dont do it later
	List<Post> posts = new UnmodifiableArrayList<Post>(new Post[] { new Post(1L, "Post-1", "Video-1"),
			new Post(2L, "Post-2", "Photo-1"), new Post(3L, "Post-3", "Photo-2") }, 3);

	public PostServiceImpl() {

	}

	@Override
	public Post getPost(Long postId) {
		Optional<Post> optionalPost = posts.stream().filter(p -> p.getId() == postId).findFirst();
		if (optionalPost.isPresent()) {
			return optionalPost.get();
		} else {
			return null;
		}
	}
 // test git
	@Override
	public Post savePost(Post post) {
		posts.add(post);
		return post;
	}

	@Override
	public Post updatePost(Post post) {
		Post oldPost = getPost(post.getId());
		if (!oldPost.equals(null)) {
			posts.remove(oldPost);
			posts.add(post);
			return post;
		} else {
			return null;
		}
	}

	@Override
	public Post deletePost(Long postId) {
		Post oldPost = getPost(postId);
		if (oldPost != null) {
			posts.remove(oldPost);
			return oldPost;
		} else {
			return null;
		}
	}

	@Override
	public List<Post> getPostList(Long profileId) {
		return posts;
	}

}
