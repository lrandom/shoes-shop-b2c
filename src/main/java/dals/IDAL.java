package dals;

import java.util.ArrayList;

public interface IDAL<T> {
    public ArrayList<T> getList(int page, int limit, String orderBy, String orderType);

    public boolean add(T obj);

    public boolean update(T obj);

    public boolean delete(Long id);
}
