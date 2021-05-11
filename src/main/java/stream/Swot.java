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
public class Swot {
    private Long id;
    private String url;
    private List<SwotNotes> notes;
    private int sprintId;
}
