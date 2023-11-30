package umc.spring.domain.common;

import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
@Getter
public abstract class BaseEntity {
    @CreatedDate
    @Column(name = "create_at", columnDefinition = "DATETIME(6)")
    private LocalDateTime createAt;

    @LastModifiedDate
    @Column(name = "update_at", columnDefinition = "DATETIME(6)")
    private LocalDateTime updateAt;
}
