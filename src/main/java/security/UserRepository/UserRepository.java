package security.UserRepository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import security.UserModel.User;

public interface UserRepository extends JpaRepository<User, Integer> {

	Optional<User> findByuserName(String userName);
}
