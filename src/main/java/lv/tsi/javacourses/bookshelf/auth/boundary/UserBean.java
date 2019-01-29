package lv.tsi.javacourses.bookshelf.auth.boundary;

import lv.tsi.javacourses.bookshelf.books.model.UserEntity;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.io.Serializable;
import java.util.List;





@Named
@SessionScoped
public class UserBean implements Serializable {
    @PersistenceContext
    private EntityManager em;
    private String term;

    public List<UserEntity> getUsers() {

        return em.createQuery("select u from User u", UserEntity.class).getResultList();


    }

}

