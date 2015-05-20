package sorting;

public class Person implements Comparable<Person> {

	private double weight;
	private double height;
	private String name;
	public Person(String name,double weight, double height) {
		this.name=name;
		this.weight = weight;
		this.height = height;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return "Person [weight=" + weight + ", height=" + height + ", name="
				+ name + "]";
	}

	@Override
	public int compareTo(Person o) {
		
		int name=this.name.compareTo(o.name);
		
		if(name==0 && this.weight==o.weight && this.height==o.height){
			return 0;
		}else if(name>0)return 1;
		else if(name<0) return -1;
		else if (this.weight>o.weight)return 1;
		else if(this.weight<o.weight)return -1;
		else if (this.height>o.height)return 1;
		else if (this.height<o.height)return -1;
		return -1;
	}
//	@Override
//	public int compareTo(Person o) {
//		
//		
//		
//		
//		return this.name.compareTo(o.getName());
//	}
	
	
	
	
}
