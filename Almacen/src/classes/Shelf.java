package classes;


/**
 * Clase estanteria
 * @author David Díaz
 * @version 1.0
 * @created 14-feb-2015 9:50:59
 */
public class Shelf {

	/**
	 * ID de la estanteria
	 */
	private int mId;
	/**
	 * Producto que esta en esa estanteria
	 */
	private Product mProduct;
	/**
	 * Situación de la estanteria
	 */
	private Situation mSituation;

	public Shelf(){

	}

	public void finalize() throws Throwable {
		this.mProduct = null;
		this.mSituation = null;
	}

	/**
	 * Devuelve el ID de la estanteria
	 * @return int
	 */
	public int getId(){
		return mId;
	}

	/**
	 * Devuelve el producto que esta en esa estanteria
	 * @return Product
	 */
	public Product getProduct(){
		return mProduct;
	}

	/**
	 * Devuelve la situación de la estanteria
	 * @return Situation
	 */
	public Situation getSituation(){
		return mSituation;
	}

	/**
	 * Configura el ID de la estanteria
	 * @param id int
	 */
	public void setId(int id){
		mId = id;
	}

	/**
	 * Configura el producto que esta en esa estanteria
	 * @param product Product
	 */
	public void setProduct(Product product){
		mProduct = product;
	}

	/**
	 * Devuelve la situación de la estanteria
	 * @param situation Situation
	 */
	public void setSituation(Situation situation){
		mSituation = situation;
	}

}