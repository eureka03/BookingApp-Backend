package bookingApp.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import bookingApp.entity.User;


@Repository
public interface UserRepository extends  JpaRepository <User, Integer> {

}
