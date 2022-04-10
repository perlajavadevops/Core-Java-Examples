class Customer implements Cloneable{

	private int customerId;
	private String name;
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	@Override
	protected void finalize() throws Throwable {
		this.customerId = 103;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + customerId;
	//	System.out.println("name hash code "+name.hashCode());
		System.out.println("result "+result);
		result = prime * result + ((name == null) ? 0 : customerId);
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		if (customerId != other.customerId)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
}

public class ObjectClassDemo {

	public static void main(String[] args) throws Throwable {
		Customer cust1 =  new Customer();
		cust1.setCustomerId(101);
		cust1.setName("MAHESH");
		
		Customer cust2 =  new Customer();
		cust2.setCustomerId(102);
		cust2.setName("PERLA");
		
		
		System.out.println(cust1.hashCode());
		System.out.println(cust2.equals(cust1));
		
		Customer cust3 = (Customer)cust1.clone();
		System.out.println(cust3.hashCode());
		System.out.println(cust3.equals(cust1));

		cust1.finalize();
		System.out.println(cust1.getCustomerId());
		//System.out.println(cust.getClass());
	}
}
