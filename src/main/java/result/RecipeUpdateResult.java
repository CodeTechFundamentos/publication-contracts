package result;

import lombok.Getter;

import java.util.Date;

@Getter
public class RecipeUpdateResult {
    private String id;
    private String name;
    private String description;
    private String preparation;
    private String ingredients;
    private Date lastModification;

    public RecipeUpdateResult(String id, String name, String description, String preparation, String ingredients, Date lastModification) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.preparation = preparation;
        this.ingredients = ingredients;
        this.lastModification = lastModification;
    }
}