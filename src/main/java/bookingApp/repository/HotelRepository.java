package bookingApp.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import bookingApp.entity.Hotel;

@Repository
public interface HotelRepository extends JpaRepository <Hotel, Integer> {
}
