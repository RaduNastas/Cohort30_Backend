package de.ait.mvcdemo.repository;

import java.util.List;

//CRUD - Create, Read, Update, Delete
public interface CrudRepository<T> {

    List<T> findAll();

    void save(T model);

}
