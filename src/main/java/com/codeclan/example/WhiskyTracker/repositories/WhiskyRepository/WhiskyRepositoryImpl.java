package com.codeclan.example.WhiskyTracker.repositories.WhiskyRepository;

import com.codeclan.example.WhiskyTracker.models.Whisky;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

public class WhiskyRepositoryImpl implements WhiskyRepositoryCustom {
//    @Autowired
//    EntityManager entityManager;
//
//    @Transactional
//    public List<Whisky> findWhiskiesByRegion(String region) {
//
//        List<Whisky> result = null;
//
//        Session session = entityManager.unwrap(Session.class);
//
//        try {
//            Criteria cr = session.createCriteria(Whisky.class);
//            cr.createAlias("whiskies", "whiskyAlias");
//            cr.add(Restrictions.eq("whiskyAlias.region", region));
//            result = cr.list();
//        } catch (HibernateException ex) {
//            ex.printStackTrace();
//        }
////        cr.add(Restrictions.eq("name", "Cutty Sark"));
////        cr.add(Restrictions.gt("age, 25));
////        cr.add(Restrictions.lt("age, 25));
////        cr.add(Restrictions.like("firstName, "Joh"));
////        cr.add(Restrictions.ilike("firstName, "Joh")); - case sensitive
//
//        return result;
//    }
}
