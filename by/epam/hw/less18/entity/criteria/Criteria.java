package by.epam.hw.less18.entity.criteria;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Criteria {
	private String groupSearchName;
	private Map<String, Object> criteria = new HashMap<String, Object>();
	private int numberOfCriteria = 0;

	public Criteria() {
	}

	public Criteria(String groupSearchName) {
		this.groupSearchName = groupSearchName;
		this.numberOfCriteria = 0;
	}

	public String getGroupSearchName() {
		return groupSearchName;
	}

	public void add(String searchCriteria, Object value) {
		criteria.put(searchCriteria, value);
		numberOfCriteria++;
	}

	public ArrayList<String> toListOfStrings(Criteria cr) {
		ArrayList<String> list = new ArrayList<String>();
		for (Map.Entry<String, Object> pair : cr.criteria.entrySet()) {
			String line = pair.getKey() + "=" + pair.getValue();
			list.add(line);

		}
		return list;
	}

	public int getNumberOfCriteria() {
		return numberOfCriteria;
	}

	public void setNumberOfCriteria(int numberOfCriteria) {
		this.numberOfCriteria = numberOfCriteria;
	}
}