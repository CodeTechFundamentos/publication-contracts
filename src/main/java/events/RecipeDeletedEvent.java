package events;

import lombok.AllArgsConstructor;
import lombok.Value;

@Value
@AllArgsConstructor
public class RecipeDeletedEvent {
    private String id;
}
