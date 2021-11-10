package command;

import lombok.Value;
import org.axonframework.modelling.command.TargetAggregateIdentifier;

@Value
public class DeleteRecommendationC {
    @TargetAggregateIdentifier
    private String id;
}
