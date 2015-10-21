package app;

import org.hibernate.Session;

import java.util.Date;

public class Program {

    public static void main(String[] args) {
        System.out.println("Hello World!!!");
        Session session = HibernateUtilities.getSessionFactory().openSession();
        session.beginTransaction();

        User user = new User();
        user.setName("Joe");
        user.addHistory(new UserHistory(new Date(),"Set name to Joe"));
        user.getProteinData().setGoal(250);
        user.addHistory(new UserHistory(new Date(),"Set the goal to 250"));
        session.save(user);

        session.getTransaction().commit();

        session.beginTransaction();

        User loadedUser = (User) session.get(User.class, 1);
        System.out.println(loadedUser.getName());
        System.out.println(loadedUser.getProteinData().getGoal());
        for (UserHistory story:loadedUser.getHistory()) {
            System.out.println(story.getEntryTime().toString() + " " + story.getEntry());
        }

        loadedUser.getProteinData().setTotal(loadedUser.getProteinData().getTotal() + 50);

        session.getTransaction().commit();
        session.close();
        HibernateUtilities.getSessionFactory().close();
    }
}
