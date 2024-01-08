package com.example.demo.post;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class PostController {
    private final PostService postService;

    PostController(){
        this.postService = new PostService();
    }


    @GetMapping("/ssr")
    public String findAllSsr(Model model){
        List<Post> posts = postService.findAll();
        model.addAttribute("posts",posts);
        return "post_list.html";
    }
}