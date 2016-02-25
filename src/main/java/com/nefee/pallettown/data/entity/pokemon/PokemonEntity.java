package com.nefee.pallettown.data.entity.pokemon;

import com.nefee.pallettown.data.entity.PalletEntity;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Type;
import org.joda.time.DateTime;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@Builder
@Entity
@Table(name = "pokemons")
@NamedQueries({
        @NamedQuery(name = "PokemonEntity.findByName", query = "SELECT p FROM PokemonEntity p " +
                "WHERE p.name = :pokemon_name")
})
public class PokemonEntity extends PalletEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pokemon_id", unique = true, nullable = false)
    private Long id;

    @Column(name = "name")
    @NotNull
    private String name;

    @Column(name = "birth")
    @NotNull
    @Type(type = "org.jadira.usertype.dateandtime.joda.PersistentDateTime")
    private DateTime birth;

}
