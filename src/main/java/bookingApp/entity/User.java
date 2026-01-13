package bookingApp.entity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="users")
public class User {

    @Id

    private Integer id;

    @Column(name="username")
    private String username;

    @Column(name="email")
    private String userEmail;

    @Column(name="phone")
    private String userPhone;

}
