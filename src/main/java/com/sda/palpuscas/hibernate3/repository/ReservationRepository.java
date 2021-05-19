package com.sda.palpuscas.hibernate3.repository;

import com.sda.palpuscas.hibernate3.model.Reservation;
import com.sda.palpuscas.hibernate3.utils.SessionManager;
import org.hibernate.Session;

public class ReservationRepository {
    public Reservation findById(Integer id) {
        Session session = SessionManager.getSessionFactory().openSession();
        Reservation reservation = session.find(Reservation.class, id);
        session.close();
        return reservation;
    }

}
