package com.hello;

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean; // Use jakarta.faces.bean.ManagedBean for newer specs
import javax.faces.bean.RequestScoped;

@ManagedBean(name = "selectItemsBean")
@RequestScoped
public class SelectItemsBean {

	private List<HobbitBean> hobbitList;
	private String selectedHobbitId; // Property to hold the selected value

	public SelectItemsBean() {
		hobbitList = new ArrayList<>();
		hobbitList.add(new HobbitBean("H001", "Frodo Baggins", "The Ring-bearer", false));
		hobbitList.add(new HobbitBean("H002", "Samwise Gamgee", "Frodo's loyal gardener", false));
		hobbitList.add(new HobbitBean("H003", "Peregrin Took", "A boisterous hobbit", true)); // Disabled
	}

	// Getters and setters for hobbitList and selectedHobbitId...
	public List<HobbitBean> getHobbitList() {
		return hobbitList;
	}

	public void setHobbitList(List<HobbitBean> hobbitList) {
		this.hobbitList = hobbitList;
	}

	public String getSelectedHobbitId() {
		return selectedHobbitId;
	}

	public void setSelectedHobbitId(String selectedHobbitId) {
		this.selectedHobbitId = selectedHobbitId;
	}
}
