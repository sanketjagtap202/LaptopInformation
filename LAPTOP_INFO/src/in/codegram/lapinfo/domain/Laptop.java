package in.codegram.lapinfo.domain;
/**
 * Here, we will create entity and their variables and create getter and setter properties
 * @author USER
 *
 */
public class Laptop {

	private int id;
	private String lapi_type;
	private String specifications;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLapi_type() {
		return lapi_type;
	}
	public void setLapi_type(String lapi_type) {
		this.lapi_type = lapi_type;
	}
	public String getSpecifications() {
		return specifications;
	}
	public void setSpecifications(String specifications) {
		this.specifications = specifications;
	}
	@Override
	public String toString() {
		return "Laptop [id=" + id + ", lapi_type=" + lapi_type + ", specifications=" + specifications + "]";
	}
	
	
}
