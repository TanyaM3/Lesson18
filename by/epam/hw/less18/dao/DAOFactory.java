package by.epam.hw.less18.dao;

import by.epam.hw.less18.dao.impl.FindDeviceDAOImpl;

public class DAOFactory {
	private static final DAOFactory instance = new DAOFactory();

	private final DeviceDAO deviceDAO = new FindDeviceDAOImpl();

	private DAOFactory() {
	}

	public DeviceDAO getApplianceDAO() {
		return deviceDAO;
	}

	public static DAOFactory getInstance() {
		return instance;
	}
}