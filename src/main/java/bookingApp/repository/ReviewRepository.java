package bookingApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import bookingApp.entity.Review;

public interface ReviewRepository extends JpaRepository<Review, Integer> {
}
