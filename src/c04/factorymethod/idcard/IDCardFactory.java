package c04.factorymethod.idcard;

import java.util.ArrayList;
import java.util.List;

import c04.factorymethod.framework.Factory;
import c04.factorymethod.framework.Product;

public class IDCardFactory extends Factory{
	private List<String> owners = new ArrayList<String>();
	@Override
	protected Product createProduct(String owner) {
		return new IDCard(owner);
	}

	@Override
	protected void registerProduct(Product p) {
		owners.add(((IDCard)p).getOwner());
	}
	public List<String> getOwners() {
		return owners;
	}
}
