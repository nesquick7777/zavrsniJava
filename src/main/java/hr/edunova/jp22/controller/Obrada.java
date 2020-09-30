/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.edunova.jp22.controller;

import hr.edunova.jp22.utility.EdunovaException;
import hr.edunova.jp22.utility.HibernateUtil;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author Korisnik
 */
public abstract class Obrada<T> {

    protected T entitet;
    protected Session sesion;

    public abstract List<T> getPodaci();

    protected abstract void kontrolaCreate() throws EdunovaException;

    protected abstract void kontrolaUpdate() throws EdunovaException;

    protected abstract void kontrolaDelete() throws EdunovaException;

    public Obrada(T entitet) {
        this();
        this.entitet = entitet;
    }

    public Obrada() {
        this.sesion = HibernateUtil.getSessionFactory().openSession();
    }

    public T create() throws EdunovaException {
        kontrolaCreate();
        save();
        return entitet;
    }

    public T createAll(List<T> lista) throws EdunovaException {
        sesion.beginTransaction();
        for (T t : lista) {
            setEntitet(t);
            kontrolaCreate();
            sesion.save(t);
        }
        sesion.getTransaction().commit();

        return entitet;
    }

    public T update() throws EdunovaException {
        kontrolaUpdate();
        save();
        return entitet;
    }

    public boolean delete() throws EdunovaException {
        kontrolaDelete();
        sesion.beginTransaction();
        sesion.delete(entitet);
        sesion.getTransaction().commit();
        return true;
    }

    private void save() {
        sesion.beginTransaction();
        sesion.save(entitet);
        sesion.getTransaction().commit();
    }

    public T getEntitet() {
        return entitet;
    }

    public void setEntitet(T entitet) {
        this.entitet = entitet;
    }

}
