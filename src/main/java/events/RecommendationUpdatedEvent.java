package events;

import lombok.Value;

import java.util.Date;

@Value
public class RecommendationUpdatedEvent {
    private String id;
    private String name;
    private String description;
    private Date lastModification;
}
