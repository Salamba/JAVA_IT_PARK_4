package ru.itpark.app.models;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "jewerlys")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Jewerly {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    // id
    private Long id;
    // тип изделия
    private String brand;

    @OneToMany(mappedBy = "jewerly")
    private List<JewerlyModel> jewerlyModelList;


}

