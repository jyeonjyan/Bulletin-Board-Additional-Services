package com.server.posting.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class HitDto {
    private Long postIdx;
    private Long hit;
}
