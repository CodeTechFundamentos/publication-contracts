package result;

import lombok.Getter;

import java.util.Date;

@Getter
public class RecommendationUpdateResult {
    private String id;
    private String name;
    private String description;
    private Date lastModification;

    public RecommendationUpdateResult(String id, String name, String description, Date lastModification) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.lastModification = lastModification;
    }
}