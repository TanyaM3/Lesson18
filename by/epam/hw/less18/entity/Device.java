package by.epam.hw.less18.entity;

import java.io.Serializable;
import java.util.Objects;

public abstract class Device implements Serializable {
	private static final long serialVersionUID = 1L;

	private String type;

	public Device() {

	}

	public Device(String type) {
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public int hashCode() {
		return Objects.hash(type);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Device other = (Device) obj;
		return Objects.equals(type, other.type);
	}

	@Override
	public String toString() {
		return "Device [type=" + type + "]";
	}
}