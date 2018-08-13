package com.tenacle.monopolywealthcalculator.persistence.stubs;

import com.tenacle.monopolywealthcalculator.objects.Session;
import com.tenacle.monopolywealthcalculator.persistence.SessionPersistence;

import java.util.List;

public class SessionPersistenceStub implements SessionPersistence {
    List<Session> sessionList;

    SessionPersistenceStub(List<Session> sessionList) {
        this.sessionList = sessionList;
    }

    @Override
    public List getAllSession() {
        return this.sessionList;
    }

    @Override
    public Session getSession(Session session) {
        return this.sessionList.get(this.sessionList.indexOf(session));
    }

    @Override
    public Session getSession(String name) {
        return getSession(new Session(name, null, null));
    }

    @Override
    public boolean storeSession(Session session) {
        return this.sessionList.add(session);
    }

    @Override
    public boolean updateSession(Session session) {
        boolean updated = false;
        if( this.sessionList.remove(session) ) {
            updated = storeSession(session);
        }
        return updated;
    }

    @Override
    public boolean deleteSession(Session session) {
        return this.sessionList.remove(session);
    }

    @Override
    public boolean deleteSession(String name) {
        return deleteSession(new Session(name, null, null));
    }
}
