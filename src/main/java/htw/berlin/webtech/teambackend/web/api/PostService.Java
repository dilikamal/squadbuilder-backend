package htw.berlin.webtech.teambackend.web.api;


import htw.berlin.webtech.teambackend.web.PostRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PostService {

    final
    PostRepository repo;

    public PostService(PostRepository repo) {
        this.repo = repo;
    }

    public Post addPost (final Post post){
        return repo.save(post);
    }

    public Optional<Post> getPost(Long id) {
        return this.repo.findById(id);
    }

    public Iterable<Post> getPosts() {
        return this.repo.findAll();
    }

    public Post get(Long id){
        return repo.findById(id).orElseThrow(() -> new RuntimeException());
    }
}