package persistencia;

public class DAOFactory {
	private DAOFactory factory;

	public DAOFactory getFactory() {
		return this.factory;
	}

	public void setFactory(DAOFactory factory) {
		this.factory = factory;
	}

	public CategoryDAO getCategoryDAO() {
		return null;
	}

	public UserDAO getUserDAO() {
		return null;
	}

	public UserDetailDAO getUserDetailDAO() {
		return null;
	}

	public ProductoDAO getProductoDAO()

	{
		return null;
	}

	public ShoppingBasketDAO getShoppingBasketDAO() {
		return null;
	}

}
