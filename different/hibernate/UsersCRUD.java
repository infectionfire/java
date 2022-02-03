package hibernate;

import org.hibernate.Session;

import java.util.List;

public class UsersCRUD {

    public void save(UsersForHibernate users) {
        Session session = HibernateUtil.getSessionFactory().openSession(); //открываем сессию
        session.beginTransaction();
        session.save(users); //пользуемся ее методами
        session.flush();
        session.close();
    }

    public void delete(UsersForHibernate users) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.delete(users);
        session.flush();
        session.close();
    }

    public List<UsersForHibernate> getAll(){
        Session session = HibernateUtil.getSessionFactory().openSession();
        return session.createCriteria(UsersForHibernate.class).list();
    }

    public UsersForHibernate getById(Integer id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        UsersForHibernate users = session.get(UsersForHibernate.class, id);
        return users;
    }

}