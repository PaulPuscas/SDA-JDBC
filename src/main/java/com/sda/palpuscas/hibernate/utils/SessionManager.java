package com.sda.palpuscas.hibernate.utils;

import com.sda.palpuscas.hibernate.model.Account;
import com.sda.palpuscas.hibernate.model.Department;
import com.sda.palpuscas.hibernate.model.Employee;
import com.sda.palpuscas.hibernate.model.Project;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionManager extends AbstractSessionManager {

    private static final SessionManager INSTANCE = new SessionManager();

    private SessionManager() {
    }

    public static void shutDown() {
        INSTANCE.shutdownSessionManager();
    }

    public static SessionFactory getSessionFactory() {
        return INSTANCE.getSessionFactory("HumanResources");
    }

    @Override
    protected void setAnnotatedClasses(Configuration configuration) {
        configuration.addAnnotatedClass(Department.class);
        configuration.addAnnotatedClass(Employee.class);
        configuration.addAnnotatedClass(Project.class);
        configuration.addAnnotatedClass(Account.class);
    }


}
