package hibernate;

public class Main {

    public static void main(String[] args) {
        UsersCRUD usersCRUD = new UsersCRUD();
        UsersForHibernate users1 = new UsersForHibernate();
        users1.setName("John");
        users1.setEmail("connor_john@gmail.com");
        users1.setPassword("somepswd123");
        usersCRUD.save(users1);

        UsersForHibernate users2 = new UsersForHibernate();
        users2.setName("Sara");
        users2.setEmail("sarra_mother@gmail.com");
        users2.setPassword("qwerty123");
        usersCRUD.save(users2);

        usersCRUD.getAll().forEach(it->System.out.println(it));

        UsersForHibernate userWithId1 = usersCRUD.getById(5);
        System.out.println(userWithId1);

        usersCRUD.delete(userWithId1);

        usersCRUD.getAll().forEach(it->System.out.println(it));

    }

}