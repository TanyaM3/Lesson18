package by.epam.hw.less18.service;

import java.util.List;

import by.epam.hw.less18.entity.Device;
import by.epam.hw.less18.entity.criteria.Criteria;

public interface DeviceService {
	List<Device> find(Criteria criteria) throws ServiceException;
}