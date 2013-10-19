package persistencia;

public interface GenericDAO<T, ID> {

	public void create(T entity);

	public void read(ID id);

	public void update(T entity);

	public void deleteById(ID id);

}
