package ru.itpark.app.models;


import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "jewerly_model")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(exclude = "jewerlys")
@ToString(exclude = "jewerlys")
@Builder
public class JewerlyModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    // id
    private Long id;
    // марка автомобиля
    private String model;


    @ManyToOne
    @JoinColumn(name = "jewerly_id")
    private Jewerly jewerly;

    @OneToOne(mappedBy = "jewerlyModel")
    private FileInfo image;
}
