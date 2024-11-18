package com.Projects.jobPortal.collections;

import com.Projects.jobPortal.entity.post;
import com.Projects.jobPortal.repository.postRepository;
import com.Projects.jobPortal.repository.searchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class postController {

    @Autowired
    postRepository postRepo;

    @Autowired
    searchRepository searchRepository;

    @GetMapping("/allPosts")
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

    @GetMapping("/posts/{text}")
    public List<post> searchPost(@PathVariable String text){
       List<post> send =  searchRepository.findByText(text);
       if(send.size() == 0){
           return postRepo.findAll();
       }
         return send;
    }

}
