package ac.jp.ohara.Shift.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ac.jp.ohara.Shift.model.User;

@Repository
public interface UserRepository extends JpaRepository<User,Long>{
	Optional<User> findByUsernameAndPassword(String username,String password);
	Optional<User> findByUsername(String username);
	boolean existsByUsername(String username);
}