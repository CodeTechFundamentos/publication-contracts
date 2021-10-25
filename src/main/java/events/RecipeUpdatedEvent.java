package events;

import lombok.Value;

import java.util.Date;

@Value
public class RecipeUpdatedEvent {
    private String id;
    private String name;
    private String description;
    private String preparation;
    private String ingredients;
    private Integer favorite;
    private Date lastModification;
}
