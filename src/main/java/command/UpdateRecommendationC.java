package command;

import lombok.Value;
import org.axonframework.modelling.command.TargetAggregateIdentifier;

import java.util.Date;

@Value
public class UpdateRecommendationC {
    @TargetAggregateIdentifier
    private String id;
    private String name;
    private String description;
    private Date lastModification;
}
