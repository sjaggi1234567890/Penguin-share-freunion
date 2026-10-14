package freunion.com.freunion;

import freunion.com.freunion.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface repository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
}