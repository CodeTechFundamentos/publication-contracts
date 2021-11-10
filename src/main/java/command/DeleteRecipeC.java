package command;

import lombok.Value;
import org.axonframework.modelling.command.TargetAggregateIdentifier;

@Value
public class DeleteRecipeC {
    @TargetAggregateIdentifier
    private String id;
}
