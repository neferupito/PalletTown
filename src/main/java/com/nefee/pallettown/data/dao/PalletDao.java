package com.nefee.pallettown.data.dao;

import com.nefee.pallettown.core.exception.PalletDataException;
import com.nefee.pallettown.data.entity.PalletEntity;
import lombok.Getter;
import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class PalletDao<T extends PalletEntity> {

    @Autowired
    @Getter
    private SessionFactory sessionFactory;

    @Getter
    private final Class<T> entityClass;

    public PalletDao(Class<T> entityClass) {
        this.entityClass = entityClass;
    }

    public void create(T entity) {
        sessionFactory.getCurrentSession().persist(entity);
    }

    public void update(T entity) {
        sessionFactory.getCurrentSession().merge(entity);
    }

    public void delete(T entity) throws PalletDataException {
        try {
            sessionFactory.getCurrentSession().delete(entity);
        } catch (HibernateException he) {
            throw new PalletDataException("Could't delete this entity: " + he.getMessage());
        }
    }

}
