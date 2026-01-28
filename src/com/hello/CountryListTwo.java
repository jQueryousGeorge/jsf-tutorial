/* This is a managedBean version of CountryList.java */

package com.hello;
import java.util.Locale;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name = "countryListTwo")
@RequestScoped
public class CountryListTwo {
	private List<String> countries = new ArrayList<>();
	
	public CountryListTwo() {
		// Get an array of two-letter country codes
		String[] countryCodes = Locale.getISOCountries();
		
		// Convert the array to a list for easy manipulation
		for (String countryCode : countryCodes) {
			Locale locale = new Locale.Builder()
					.setRegion(countryCode)
					.build();
			
			// Get the display name from the country code && add it to the list
			countries.add(locale.getDisplayCountry());
		}
		
		// Sort the list alphabetically
		Collections.sort(countries);

	}
	
	public List<String> getCountries() {
		return countries;
	}
	
	public void setCountries(List<String> countries) {
		this.countries = countries;
	}
}