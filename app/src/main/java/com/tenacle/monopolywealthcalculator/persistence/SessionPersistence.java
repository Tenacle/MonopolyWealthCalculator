package com.tenacle.monopolywealthcalculator.persistence;

import com.tenacle.monopolywealthcalculator.objects.Session;

import java.util.List;

public interface SessionPersistence {
    List getAllSession();

    Session getSession(Session session);
    Session getSession(String name);

    boolean storeSession(Session session);

    boolean updateSession(Session session);

    boolean deleteSession(Session session);
    boolean deleteSession(String name);

}
