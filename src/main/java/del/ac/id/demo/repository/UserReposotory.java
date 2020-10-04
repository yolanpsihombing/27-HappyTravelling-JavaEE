package del.ac.id.demo.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import del.ac.id.demo.model.User;

@Repository
public interface UserReposotory extends JpaRepository<User, Long>{
	User findByEmail(String email);
}
