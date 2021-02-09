package com.server.posting.domain;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Commnet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "commentIdx")
    private Long commentIdx;
    //댓글 내용
    private String content;

    private Long postIdx;
}
