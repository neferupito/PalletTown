package com.nefee.pallettown.data.dao.pokemon;

import com.nefee.pallettown.data.dao.PalletDao;
import com.nefee.pallettown.data.entity.pokemon.PokemonEntity;
import org.hibernate.HibernateException;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository("PokemonDao")
public class PokemonDao extends PalletDao<PokemonEntity> {

    private static final String QUERY_FINDBYNAME = "PokemonEntity.findByName";

    public PokemonDao() {
        super(PokemonEntity.class);
    }

    public Optional<PokemonEntity> findByName(String name) {
        Optional<PokemonEntity> optional = Optional.empty();
        try {
            optional = Optional.of((PokemonEntity) getSessionFactory().getCurrentSession().getNamedQuery(QUERY_FINDBYNAME).uniqueResult());
        } catch (HibernateException he) {
//            return optional;
        }
        return optional;
    }

}
