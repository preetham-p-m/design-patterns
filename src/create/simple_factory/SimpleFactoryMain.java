package create.simple_factory;

import create.simple_factory.models.Post;

public class SimpleFactoryMain {

    public static void main(String[] args) {
        Post post;
        post = PostFactory.createPost("blog");
        System.out.println(post);

        post = PostFactory.createPost("news");
        System.out.println(post);

        post = PostFactory.createPost("product");
        System.out.println(post);
    }
}
