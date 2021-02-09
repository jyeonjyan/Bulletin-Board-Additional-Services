package com.server.posting.controller;

import com.server.posting.dto.CommentDto;
import com.server.posting.service.BoardService;
import com.server.posting.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/comment")
public class CommentController {
    @Autowired
    private BoardService boardService;
    @Autowired
    private CommentService commentService;
    //Commnet 달기.
    @PostMapping("/write")
    public void write(@RequestBody CommentDto commentDto, @RequestParam Long postIdx){
        commentService.write(commentDto, postIdx);
    }
    //Comment 수정하기.
    @PostMapping("/update")
    public void update(@RequestBody CommentDto commentDto, @RequestParam Long commentIdx){
        commentService.update(commentDto, commentIdx);
    }
}