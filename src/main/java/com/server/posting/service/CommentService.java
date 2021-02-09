package com.server.posting.service;

import com.server.posting.domain.Board;
import com.server.posting.domain.Comment;
import com.server.posting.dto.CommentDto;
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

    // Commnet 달기.
    @Transactional
    public Comment write(CommentDto commentDto, Long postIdx) {
        // 현재 게시물의 idx를 구한다.
        Board board = boardRepository.findByPostIdx(postIdx).orElseThrow(null);
        // comment할 postIdx 현재 postIdx로 지정한다.
        commentDto.setPostIdx(board.getPostIdx());
        // Service toEntity함수를 Save.
        return commentRepository.save(commentDto.toEntity());
    }
    // Commnet 수정하기.
    @Transactional
    public void update(CommentDto commentDto, Long commentIdx) {
        // param으로 받은 해당 commnetIdx 값을 찾는다.
        Comment comment = commentRepository.findByCommentIdx(commentIdx).orElseThrow(null);
        // Domain에 만들어준 update 문을 호출시켜서 업데이트 한다.
        comment.update(commentDto);
    }
}
