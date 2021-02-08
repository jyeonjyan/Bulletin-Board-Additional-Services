package com.server.posting.controller;

import com.server.posting.dto.BoardDto;
import com.server.posting.dto.HitDto;
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

    @GetMapping("/view/{postIdx}")
    public void view(@RequestBody BoardDto boardDto){
        boardService.view(boardDto);
    }
}
