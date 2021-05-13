package com.sda.palpuscas.hibernate.repository;

import com.sda.palpuscas.hibernate.model.Department;
import com.sda.palpuscas.hibernate.model.Project;
import com.sda.palpuscas.hibernate.utils.SessionManager;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class ProjectRepository {
    // TODO: 5/11/2021 to be implemented in a similar way like in DepartmentRepository
    public void delete(Project project) {
        Session session = SessionManager.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(project);
        transaction.commit();
        session.close();
    }
    public void update(Project project) {
        Session session = SessionManager.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.update(project);
        transaction.commit();
        session.close();
    }
    public Project findById(Integer id) {
        Session session = SessionManager.getSessionFactory().openSession();
        //The find method returns the object with the provided id
        Project project = session.find(Project.class, id);
        session.close();
        return project;
    }
    public void save(Project project) {
        Session session = SessionManager.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
//        Project project = new Project();
//        project.setName(project);
        //The save method persists the object to the database
        session.save(project);
        transaction.commit();
        session.close();
    }
}
