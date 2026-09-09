package object_methods;

import java.util.Objects;

public class Product {
	private String product;
	private String description;
	private int val;
	public Product() {
		
	}
	
	public Product(String product, String description, int val) {
		super();
		this.product = product;
		this.description = description;
		this.val = val;
	}
	

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getVal() {
		return val;
	}

	public void setVal(int val) {
		this.val = val;
	}

	@Override
	public String toString() {
		return description;
		
	}

	@Override
	public int hashCode() {
		return Objects.hash(description, product, val);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return Objects.equals(description, other.description) && Objects.equals(product, other.product)
				&& val == other.val;
	}
	
	
}
