package com.server.posting.domain;


import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Board {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long postIdx;

    @Column
    private String sub;

    @Column
    private String content;

    @Column
    private int hit = 0;
}
