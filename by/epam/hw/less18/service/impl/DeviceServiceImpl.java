package by.epam.hw.less18.service.impl;

import java.util.List;

import by.epam.hw.less18.dao.DAOException;
import by.epam.hw.less18.dao.DAOFactory;
import by.epam.hw.less18.dao.DeviceDAO;
import by.epam.hw.less18.entity.Device;
import by.epam.hw.less18.entity.criteria.Criteria;
import by.epam.hw.less18.service.DeviceService;
import by.epam.hw.less18.service.ServiceException;
import by.epam.hw.less18.service.validation.Validator;

public class DeviceServiceImpl implements DeviceService {

	@Override
	public List<Device> find(Criteria criteria) throws ServiceException {
		if (!Validator.criteriaValidator(criteria)) {
			return null;
		}

		DAOFactory factory = DAOFactory.getInstance();
		DeviceDAO devviceDAO = factory.getApplianceDAO();

		List<Device> devices;

		try {
			devices = devviceDAO.find(criteria);
		} catch (DAOException e) {
			throw new ServiceException(e);
		}

		// you may add your own code here

		return devices;
	}
}