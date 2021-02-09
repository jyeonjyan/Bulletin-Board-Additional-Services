package com.server.posting.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.server.posting.domain.Comment;
import com.sun.istack.NotNull;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
public class CommentDto {
    @JsonIgnore
    private Long postIdx;
    private Long commentIdx;
    @NotNull
    private String content;

    public Comment toEntity() {
        return Comment.builder()
                .content(this.content)
                .postIdx(this.postIdx)
                .build();
    }
}
