package com.server.posting.controller;

import com.server.posting.dto.BoardDto;
import com.server.posting.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/board")
public class BoardController {
    @Autowired
    private BoardService boardService;

    @PostMapping("/post")
    public void post(@RequestBody BoardDto boardDto){
        boardService.post(boardDto);
    }
    // param이 해당 게시물에 접근했을때.
    @GetMapping("/view/{postIdx}")
    public void view(@PathVariable Long postIdx){
        boardService.view(postIdx);
    }
}
