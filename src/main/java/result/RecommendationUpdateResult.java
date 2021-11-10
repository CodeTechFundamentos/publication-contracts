package result;

import lombok.Getter;

import java.util.Date;

@Getter
public class RecommendationUpdateResult {
    private String id;
    private String name;
    private String description;
    private Date createdAt;
    private Date lastModification;
    private Integer nutritionistId;

    public RecommendationUpdateResult(String id, String name, String description, Date createdAt, Date lastModification, Integer nutritionistId) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.createdAt = createdAt;
        this.lastModification = lastModification;
        this.nutritionistId = nutritionistId;
    }
}