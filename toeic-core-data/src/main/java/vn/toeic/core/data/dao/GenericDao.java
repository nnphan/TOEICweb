package vn.toeic.core.data.dao;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

public interface GenericDao<ID extends Serializable, T> {
    List<T> findAll();
    T update(T entity);
    T save(T entity);
    T findById(ID id);
    Object[] findByProperty(String property, Object value, String sortExpression,String sortDirection);
    Integer delete(List<ID> ids);

}
