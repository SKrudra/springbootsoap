package hello;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;

public class CountryRepository {
	private static final Map<String, Country> countries = new HashMap<>();

	@PostConstruct
	public void initData() {
		Country spain = new Country();
		spain.setName("Spain");
		spain.setCapital("Madrid");
		spain.setCurrency(Currency.EUR);
		spain.setPopulation(4587652);

		countries.put(spain.getName(), spain);

		Country india = new Country();
		india.setName("India");
		india.setCapital("New Delhi");
		india.setCurrency(Currency.INR);
		india.setPopulation(1300000);

		countries.put(india.getName(), india);
	}

	public Country findCountry(String name) {
		Assert.notNull(name, "The country name must not be null");
		return countreis.get(name);
	}
}