package htw.berlin.webtech.teambackend.web;

import htw.berlin.webtech.teambackend.web.api.Post;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends CrudRepository<Post, Long> {
}