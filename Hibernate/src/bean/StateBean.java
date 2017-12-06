package bean;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "State")
public class StateBean {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int stateId;
	private String stateName;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "state")
	private Collection<CityBean> users = new ArrayList<CityBean>();

	public int getStateId() {
		return stateId;
	}

	public void setStateId(int stateId) {
		this.stateId = stateId;
	}

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

}
