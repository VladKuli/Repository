package my.App.storage.core.domain;

import liquibase.pro.packaged.C;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@Entity
@Table(name="boxes")
public class Box {

    @Id
    @Column(name="id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    @Column(name = "description", nullable = false)
    private String Description;
    @Column(name = "actor", nullable = false)
    private String actor;
    @Column(name = "type", nullable = false)
    private String Type;

}