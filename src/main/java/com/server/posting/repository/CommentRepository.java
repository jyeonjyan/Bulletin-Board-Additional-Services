package com.server.posting.repository;

import com.server.posting.domain.Commnet;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CommentRepository extends JpaRepository<Commnet, Long> {
    Optional<Commnet> findByCommentIdx(Long commentIdx);
}
