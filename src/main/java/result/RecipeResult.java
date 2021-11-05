package result;

import lombok.Getter;

import java.util.Date;

@Getter
public class RecipeResult {
    private String id;
    private String name;
    private String description;
    private String preparation;
    private String ingredients;
    private Integer favorite;
    private Date createdAt;
    private Date lastModification;
    private Integer nutritionistId;

    public RecipeResult(String id, String name, String description, String preparation, String ingredients, Integer favorite, Date createdAt, Date lastModification, Integer nutritionistId) {
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
