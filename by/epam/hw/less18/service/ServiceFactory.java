package by.epam.hw.less18.service;

import by.epam.hw.less18.service.impl.DeviceServiceImpl;

public final class ServiceFactory {
	private static final ServiceFactory instance = new ServiceFactory();

	private final DeviceService deviceService = new DeviceServiceImpl();

	private ServiceFactory() {
	}

	public DeviceService getDeviceService() {

		return deviceService;
	}

	public static ServiceFactory getInstance() {
		return instance;
	}
}