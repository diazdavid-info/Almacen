package classes;

public class LogJobs {

	/**
	 * ID del log
	 */
	private int mId;
	/**
	 * Trabajador que realiza el trabajo
	 */
	private Person mWorker;
	/**
	 * Descripción del trabajo
	 */
	private String mDescription;
	
	public LogJobs(){}
	
	public LogJobs(Person worker, String description){
		mWorker = worker;
		mDescription = description;
	}

	/**
	 * Método que devuelve el ID
	 * @return int
	 */
	public int getmId() {
		return mId;
	}

	/**
	 * Método que configura el ID
	 * @param mId int
	 */
	public void setmId(int mId) {
		this.mId = mId;
	}

	/**
	 * Método que devuelve la persona
	 * @return Person
	 */
	public Person getmWorker() {
		return mWorker;
	}

	/**
	 * Método que configura la persona
	 * @param mWorker Person
	 */
	public void setmWorker(Person mWorker) {
		this.mWorker = mWorker;
	}

	/**
	 * Método que devuelve la descripción
	 * @return String
	 */
	public String getmDescription() {
		return mDescription;
	}

	/**
	 * Método que configura la descripción
	 * @param mDescription String
	 */
	public void setmDescription(String mDescription) {
		this.mDescription = mDescription;
	}
}
