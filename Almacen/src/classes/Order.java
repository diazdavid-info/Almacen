package classes;

import java.util.ArrayList;
import java.util.List;


/**
 * Clase de pedidos
 * @author David Díaz
 * @version 1.0
 * @created 14-feb-2015 9:50:46
 */
public class Order {

	/**
	 * Fecha del pedido
	 */
	private String mDate;
	/**
	 * Atributo ID
	 */
	private int mId;
	/**
	 * Cliente del pedido
	 */
	private Person mPerson;
	/**
	 * Precio del pedido
	 */
	private Float mPrice;
	/**
	 * ArrayList Productos
	 */
	private List<Product> mProducts;

	public Order(){
		mProducts = new ArrayList<Product>();
	}
	
	public Order(String date, Person person, Float price){
		this();
		mDate = date;
		mPerson = person;
		mPrice = price;
	}

	public void finalize() throws Throwable {
		this.mDate = null;
		this.mPerson = null;
		this.mPrice = null;
		this.mProducts = null;
	}

	/**
	 * Devuelve la fecha del pedido
	 * @return String
	 */
	public String getDate(){
		return mDate;
	}

	/**
	 * Devuelve el ID del pedido
	 * @return int
	 */
	public int getId(){
		return mId;
	}

	/**
	 * Devuelve el cliente del pedido
	 * @return Person
	 */
	public Person getPerson(){
		return mPerson;
	}

	/**
	 * Devuelve el precio del pedido
	 * @return Float
	 */
	public Float getPrice(){
		return mPrice;
	}

	/**
	 * Devuelve los productor del pedidio
	 * @return ArrayList
	 */
	public List<Product> getProducts(){
		return mProducts;
	}

	/**
	 * Configura la fecha del pedido
	 * @param date String
	 */
	public void setDate(String date){
		mDate = date;
	}

	/**
	 * Configura el ID del pedido
	 * @param id int
	 */
	public void setId(int id){
		mId = id;
	}

	/**
	 * Configura el cliente del pedido
	 * @param person Person
	 */
	public void setPerson(Person person){
		mPerson = person;
	}

	/**
	 * Configura el precio del pedido
	 * @param price Float
	 */
	public void setPrice(Float price){
		mPrice = price;
	}

	/**
	 * Configura los productos del pedidio
	 * @param products ArrayList
	 */
	public void setProducts(ArrayList<Product> products){
		mProducts = products;
	}
	
	/**
	 * Método que añade un producto a la lista
	 * @param product Product
	 */
	public void addProduct(Product product){
		mProducts.add(product);
	}

}