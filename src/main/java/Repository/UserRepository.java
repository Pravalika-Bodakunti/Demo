package Repository;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository<Users> extends JpaRepository<Users, Long> {
    // Additional custom queries can be added here
}
