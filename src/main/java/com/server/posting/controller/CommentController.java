package com.server.posting.controller;

import com.server.posting.dto.CommnetDto;
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

    @PostMapping("/write")
    public void write(@RequestBody CommnetDto commnetDto, @RequestParam Long postIdx){
        commentService.write(commnetDto, postIdx);
    }
}