package com.example.demo.post;
public class Post {
    private final int id;
    private final String title;
    private final String body;
    private final String authorName;

    public Post(int id, String title, String body, String authorName) {
        this.id = id;
        this.title = title;
        this.body = body;
        this.authorName = authorName;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getBody() {
        return body;
    }

    public String getAuthorName() {
        return authorName;
    }
}