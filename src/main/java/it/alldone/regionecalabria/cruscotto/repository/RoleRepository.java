package it.alldone.regionecalabria.cruscotto.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import it.alldone.regionecalabria.cruscotto.models.ERole;
import it.alldone.regionecalabria.cruscotto.models.Role;

public interface RoleRepository extends MongoRepository<Role, String> {
  Optional<Role> findByName(ERole name);
}
