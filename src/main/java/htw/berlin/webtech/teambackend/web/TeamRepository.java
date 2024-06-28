package htw.berlin.webtech.teambackend.web;

import htw.berlin.webtech.teambackend.web.api.Team;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeamRepository extends CrudRepository<Team, Long> {


}
