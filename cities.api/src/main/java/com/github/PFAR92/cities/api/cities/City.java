package com.github.PFAR92.cities.api.cities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;
import org.hibernate.annotations.TypeDefs;
import org.springframework.data.geo.Point;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.awt.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "cidade")
/*@TypeDefs(value = {
        @TypeDef(name = "point", typeClass = Point.class)
})*/
public class City {

    @Id
    private Long id;

    @Column(name = "nome")
    private String name;

    private Integer uf;

    private Integer ibge;

    //1st
    @Column(name = "lat_lon")
    private String geoLocation;

    //2st
    /*@Type(type = "point")
    @Column(name = "lat_lon", updatable = false, insertable = false)
    private Point location;*/


}
