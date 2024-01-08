package com.example.demo.post;

import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.*;


class PostService {
    private PostRepository postRepository;
    PostService() {
        this.postRepository = new PostRepository();
    }
    List<Post> findAll(){
        return this.postRepository.findAll();
    }
}