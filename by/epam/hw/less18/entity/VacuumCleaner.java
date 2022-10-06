package by.epam.hw.less18.entity;

import java.util.Objects;

public class VacuumCleaner extends Device {
	private static final long serialVersionUID = 1L;

	private int powerConsumptiom;
	private String filterType;
	private String bagType;
	private String wandType;
	private int motorSpeedRegulation;
	private int cleaningWidth;

	public VacuumCleaner() {
		super();
	}

	public VacuumCleaner(int powerConsumptiom, String filterType, String bagType, String wandType,
			int motorSpeedRegulation, int cleaningWidth) {
		super("Vacuum Cleaner");
		this.powerConsumptiom = powerConsumptiom;
		this.filterType = filterType;
		this.bagType = bagType;
		this.wandType = wandType;
		this.motorSpeedRegulation = motorSpeedRegulation;
		this.cleaningWidth = cleaningWidth;
	}

	public int getPowerConsumptiom() {
		return powerConsumptiom;
	}

	public void setPowerConsumptiom(int powerConsumptiom) {
		this.powerConsumptiom = powerConsumptiom;
	}

	public String getFilterType() {
		return filterType;
	}

	public void setFilterType(String filterType) {
		this.filterType = filterType;
	}

	public String getBagType() {
		return bagType;
	}

	public void setBagType(String bagType) {
		this.bagType = bagType;
	}

	public String getWandType() {
		return wandType;
	}

	public void setWandType(String wandType) {
		this.wandType = wandType;
	}

	public int getMotorSpeedRegulation() {
		return motorSpeedRegulation;
	}

	public void setMotorSpeedRegulation(int motorSpeedRegulation) {
		this.motorSpeedRegulation = motorSpeedRegulation;
	}

	public int getCleaningWidth() {
		return cleaningWidth;
	}

	public void setCleaningWidth(int cleaningWidth) {
		this.cleaningWidth = cleaningWidth;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result
				+ Objects.hash(bagType, cleaningWidth, filterType, motorSpeedRegulation, powerConsumptiom, wandType);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		VacuumCleaner other = (VacuumCleaner) obj;
		return Objects.equals(bagType, other.bagType) && cleaningWidth == other.cleaningWidth
				&& Objects.equals(filterType, other.filterType) && motorSpeedRegulation == other.motorSpeedRegulation
				&& powerConsumptiom == other.powerConsumptiom && Objects.equals(wandType, other.wandType);
	}

	@Override
	public String toString() {
		return "VacuumCleaner [powerConsumptiom=" + powerConsumptiom + ", filterType=" + filterType + ", bagType="
				+ bagType + ", wandType=" + wandType + ", motorSpeedRegulation=" + motorSpeedRegulation
				+ ", cleaningWidth=" + cleaningWidth + "]";
	}
}