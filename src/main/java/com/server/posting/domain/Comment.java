package com.server.posting.domain;

import com.server.posting.dto.CommentDto;
import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long commentIdx;

    //댓글 내용
    private String content;

    private Long postIdx;
    // 업데이트에 사용할 함수를 선언한다.
    public void update(CommentDto commentDto){
        this.content = commentDto.getContent();
    }
}
