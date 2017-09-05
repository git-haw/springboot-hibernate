package top.haw358.springboot.repositories.jpa;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import top.haw358.springboot.pojo.User;

/**
 * Created by haw on 17-8-30.
 */
public interface UserRepository extends JpaRepository<User, Long>{//, QueryDslPredicateExecutor<User>, JpaSpecificationExecutor<User> {
    Page<User> findByUsername(String username, Pageable pageable);
}
