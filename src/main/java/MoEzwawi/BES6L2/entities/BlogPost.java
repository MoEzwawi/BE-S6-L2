package MoEzwawi.BES6L2.entities;

import MoEzwawi.BES6L2.entities.enums.BlogPostCategory;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class BlogPost {
    private int id;
    private BlogPostCategory category;
    private String title;
    private String coverUrl;
    private String content;
    private int readingTime;

    public BlogPost(BlogPostCategory category, String title) {
        this.category = category;
        this.title = title;
    }
}
