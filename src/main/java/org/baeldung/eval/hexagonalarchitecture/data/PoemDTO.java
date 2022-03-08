package org.baeldung.eval.hexagonalarchitecture.data;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @Builder
@AllArgsConstructor
@NoArgsConstructor
public class PoemDTO {
    
    private String title;
    private String author;
}
