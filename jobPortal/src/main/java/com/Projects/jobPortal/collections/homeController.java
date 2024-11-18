package com.Projects.jobPortal.collections;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class homeController {
        @GetMapping("/")
        public String home() {
            return "redirect:/index.html";
        }
        @GetMapping("/jobs")
        public String jobs(){
            return "redirect:/jobs.html";
        }
        @GetMapping("/post")
        public String post(){
        return "redirect:/post.html";
        }

}
