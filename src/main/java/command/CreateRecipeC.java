package command;

import lombok.Value;
import org.axonframework.modelling.command.TargetAggregateIdentifier;

import java.util.Date;

@Value
public class CreateRecipeC {
    @TargetAggregateIdentifier
    private String id;
    private String name;
    private String description;
    private String preparation;
    private String ingredients;
    private Integer favorite;
    private Date createdAt;
    private Date lastModification;
    private String nutritionistId;
}
