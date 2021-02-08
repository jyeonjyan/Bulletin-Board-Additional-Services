package com.server.posting.repository;

import com.server.posting.domain.Board;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BoardRepository extends JpaRepository<Board, Long> {
    Optional<Board> findByPostIdx(Long postIdx);
}
