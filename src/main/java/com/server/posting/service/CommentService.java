package com.server.posting.service;

import com.server.posting.domain.Board;
import com.server.posting.domain.Commnet;
import com.server.posting.dto.CommnetDto;
import com.server.posting.repository.BoardRepository;
import com.server.posting.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CommentService {
    @Autowired
    private CommentRepository commentRepository;
    @Autowired
    private BoardRepository boardRepository;

    @Transactional
    public Commnet write(CommnetDto commnetDto, Long postIdx) {
        // 현재 게시물의 idx를 구한다.
        Board board = boardRepository.findByPostIdx(postIdx).orElseThrow(null);
        // comment할 postIdx 현재 postIdx로 지정한다.
        commnetDto.setPostIdx(board.getPostIdx());
        // Service toEntity함수를 Save.
        return commentRepository.save(commnetDto.toEntity());
    }
}
