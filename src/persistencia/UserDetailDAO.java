package persistencia;


public interface UserDetailDAO extends GenericDAO{

	public  UserDetailDAO findByUserId(int userId);
}
