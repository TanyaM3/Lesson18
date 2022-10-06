package by.epam.hw.less18.dao;

import java.util.List;

import by.epam.hw.less18.entity.Device;
import by.epam.hw.less18.entity.criteria.Criteria;

public interface DeviceDAO {
	List<Device> find(Criteria criteria) throws DAOException;

}