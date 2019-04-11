package edu.mum.cs.InstagramProject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import edu.mum.cs.InstagramProject.domain.Post;
import edu.mum.cs.InstagramProject.service.PostService;

@RestController
@RequestMapping("/")
public class InstagramController {

	@Autowired
	PostService postService;

	@RequestMapping("/home")
	public String home() {
		return "welcome to Instagram";
	}

	@RequestMapping("/post/get/{id}")
	public Post getPost(@PathVariable("id") Long id) {
		return postService.getPost(id);
	}

	@PostMapping("/post/save")
	public Post savePost(@RequestBody Post post) {
		return postService.savePost(post);
	}

	@RequestMapping("/post/getall")
	public List<Post> getAllPosta() {
		return postService.getPostList(0L);
	}

}
