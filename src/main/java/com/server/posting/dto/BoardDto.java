package com.server.posting.dto;

import com.sun.istack.NotNull;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BoardDto {
    @NotNull
    private String sub;

    @NotNull
    private String content;
}
