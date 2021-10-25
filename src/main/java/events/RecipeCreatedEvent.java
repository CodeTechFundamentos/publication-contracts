package events;

import lombok.Value;

import java.util.Date;

@Value
public class RecipeCreatedEvent {
    private String id;
    private String name;
    private String description;
    private String preparation;
    private String ingredients;
    private Integer favorite;
    private Date createdAt;
    private Date lastModification;
    private Integer nutritionistId;
}
