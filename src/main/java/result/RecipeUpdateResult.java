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
    private Integer favorite;
    private Date createdAt;
    private Date lastModification;
    private String nutritionistId;

    public RecipeUpdateResult(String id, String name, String description, String preparation, String ingredients, Integer favorite, Date createdAt, Date lastModification, String nutritionistId) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.preparation = preparation;
        this.ingredients = ingredients;
        this.favorite = favorite;
        this.createdAt = createdAt;
        this.lastModification = lastModification;
        this.nutritionistId = nutritionistId;
    }
}