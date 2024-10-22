package create.simple_factory;

import create.simple_factory.models.BlogPost;
import create.simple_factory.models.NewsPost;
import create.simple_factory.models.Post;
import create.simple_factory.models.ProductPost;

public class PostFactory {

    public static Post createPost(String type) {
        return switch (type.toLowerCase()) {
            case "blog" -> new BlogPost();
            case "news" -> new NewsPost();
            case "product" -> new ProductPost();
            default -> null;
        };
    }
}
