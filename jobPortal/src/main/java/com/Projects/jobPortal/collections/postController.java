package com.Projects.jobPortal.collections;

import com.Projects.jobPortal.entity.post;
import com.Projects.jobPortal.entity.searches;
import com.Projects.jobPortal.repository.postRepository;
import com.Projects.jobPortal.repository.searchRepository;
import com.Projects.jobPortal.repository.searchesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.Instant;
import java.util.Date;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class postController {

    @Autowired
    postRepository postRepo;

    @Autowired
    searchRepository searchRepository;

    @Autowired
    searchesRepository searchesRepository;


    @PostMapping("/post")
    public String addPost(@RequestBody post post)    {
        postRepo.save(post);
        return "Post Added";
    }

    @GetMapping("/allPosts")
    public List<post> getAllpost(){
        List<post> send = postRepo.findAll();
        return send;
    }
    @GetMapping("/totalPost")
    public int totalPost(){
        return postRepo.findAll().size();
    }

    @GetMapping("/posts/{text}")
    public ResponseEntity<List<post>> searchPost(@PathVariable String text) {

        searchesRepository.save(new searches(text, Date.from(Instant.now())));
        List<post> send = searchRepository.findByText(text);
        if (send.size() == 0) {
            return ResponseEntity.status(HttpStatus.FOUND)
                    .header("Location", "/noResultsPage.html")
                    .build();
        }
        return ResponseEntity.ok(send);
    }

}
