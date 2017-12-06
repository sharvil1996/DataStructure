package bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "City")
public class CityBean {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cityId;
	private String cityName;

	@ManyToOne
	@JoinColumn(name = "stateId")
	private StateBean state;

	public StateBean getState() {
		return state;
	}

	public void setState(StateBean state) {
		this.state = state;
	}

	public int getCityId() {
		return cityId;
	}

	public void setCityId(int cityId) {
		this.cityId = cityId;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

}
