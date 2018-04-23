package com.example.demo;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookmarkController {

    
    public Bookmark findThemAll(){
        return new Bookmark();
    }

}