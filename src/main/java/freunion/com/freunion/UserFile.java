package freunion.com.freunion;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "users_files")
public class UserFile {

    @Id
    @Column(name = "file_UUID")
    private Long fileUuid;

    @Column(name = "file_name", nullable = false)
    private String fileName;

    @Column(name = "file_size")
    private Long fileSize;

    @Column(name = "file_type", length = 6)
    private String fileType;

    @Column(name = "isshareable")
    private Boolean isShareable;

    @Column(name = "file_owner")
    private String fileOwner;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "owner_uuid", referencedColumnName = "UUID")
    private User owner;

}