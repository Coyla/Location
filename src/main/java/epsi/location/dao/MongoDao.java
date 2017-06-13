package epsi.location.dao;

import java.util.ArrayList;

/**
 * Created by work on 10/06/2017.
 */
interface MongoDao<T> {
    public ArrayList<T> findAll();
    public T find(String id);
    public boolean create(T obj);
    public boolean delete(T obj);
    public boolean update(T obj);

}
