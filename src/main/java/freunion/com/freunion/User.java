package freunion.com.freunion;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "users")
public class User {

    @Id
    @Column(name = "UUID")
    private Long uuid;

    @Column(name = "username", nullable = false, unique = true)
    private String username;

    @Column(name = "mobile", nullable = false)
    private Long mobile;

    @Column(name = "email")
    private String email;
    @Column(name = "password")
    private String password;
}