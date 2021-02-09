package com.server.posting.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.server.posting.domain.Board;
import com.server.posting.domain.Commnet;
import com.sun.istack.NotNull;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
public class CommnetDto{
    @JsonIgnore
    private Long postIdx;

    @NotNull
    private String content;

    public Commnet toEntity() {
        return Commnet.builder()
                .content(this.content)
                .postIdx(this.postIdx)
                .build();
    }
}
