package com.Projects.jobPortal.collections;

import com.Projects.jobPortal.entity.post;
import com.Projects.jobPortal.repository.postRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("/")
public class postController {

    @Autowired
    postRepository postRepo;

    @GetMapping("/posts")
    public List<post> getAllpost(){
        List<post> send = postRepo.findAll();
        return send;
    }
    @GetMapping("/totalPost")
    public int totalPost(){
        return postRepo.findAll().size();
    }

    @PostMapping("/post")
    public String addPost(@RequestBody post post)    {
        postRepo.save(post);
        return "Post Added";
    }

}
