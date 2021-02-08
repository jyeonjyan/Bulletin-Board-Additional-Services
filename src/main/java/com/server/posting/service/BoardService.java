package com.server.posting.service;

import com.server.posting.domain.Board;
import com.server.posting.dto.BoardDto;
import com.server.posting.repository.BoardRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class BoardService {
    private final BoardRepository boardRepository;
    public BoardService(BoardRepository boardRepository) {
        this.boardRepository = boardRepository;
    }

    @Transactional
    public Board post(BoardDto boardDto){
        Board board = Board.builder()
                .sub(boardDto.getSub())
                .content(boardDto.getContent())
                .build();

        return boardRepository.save(board);
    }
    // 해당 idx를 찾고 hit 증가.
    @Transactional
    public void view(Long postIdx) {
        Board board = boardRepository.findByPostIdx(postIdx).orElseThrow();
        board.setHit(board.getHit()+1);
    }
}
