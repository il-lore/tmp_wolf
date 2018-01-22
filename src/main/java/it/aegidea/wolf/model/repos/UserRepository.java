package it.aegidea.wolf.model.repos;

import it.aegidea.wolf.model.beans.auth.WfUser;
import org.springframework.data.repository.Repository;

public interface UserRepository extends Repository<WfUser, Long> {
   WfUser findById(Long id);

   WfUser findByUsername(String username);
}
