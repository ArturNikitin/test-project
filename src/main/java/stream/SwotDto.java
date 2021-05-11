package stream;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SwotDto {
    private Long id;
    private String url;
    private List<SwotNotesDto> notes;

    @Data
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class SwotNotesDto {
        private Long id;
        private String category;
        private String value;
    }
}
