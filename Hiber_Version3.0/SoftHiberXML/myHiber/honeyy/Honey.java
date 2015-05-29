package honeyy;

public class Honey {
	private String name;
	private String taste;
	private int id;

	@Override
	public String toString() {
		return "Honey [name=" + name + ", taste=" + taste + ", id=" + id + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTaste() {
		return taste;
	}

	public void setTaste(String taste) {
		this.taste = taste;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Honey(String name, String taste, Integer id) {
		super();
		this.name = name;
		this.taste = taste;
		this.id = id;
	}

	public Honey() {

	}

}
