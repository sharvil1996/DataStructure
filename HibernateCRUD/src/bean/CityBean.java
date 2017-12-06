package bean;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "City")
public class CityBean {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int cityId;
	private String cityName;
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "city", cascade = CascadeType.ALL)
	private Collection<UserBean> users = new ArrayList<UserBean>();

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
