package badar4code.carparkingsystem.model.entity;

import jakarta.persistence.MappedSuperclass;

import java.util.Date;

@MappedSuperclass
public class BaseEntity {
    private Boolean isActive;
    private Date creationDate;
}
