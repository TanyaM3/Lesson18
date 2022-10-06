package by.epam.hw.less18.main;

import static by.epam.hw.less18.entity.criteria.SearchCriteria.*;
import java.util.List;
import by.epam.hw.less18.entity.Device;
import by.epam.hw.less18.entity.criteria.Criteria;
import by.epam.hw.less18.service.DeviceService;
import by.epam.hw.less18.service.ServiceException;
import by.epam.hw.less18.service.ServiceFactory;

public class Main {

	public static void main(String[] args) throws ServiceException {
		List<Device> devices;

		ServiceFactory factory = ServiceFactory.getInstance();
		DeviceService service = factory.getDeviceService();

		//////////////////////////////////////////////////////////////////

		Criteria criteriaOven = new Criteria(Oven.class.getSimpleName());
		criteriaOven.add(Oven.CAPACITY.toString(), 33);

		devices = service.find(criteriaOven);

		PrintDeviceInfo.print(devices);

		//////////////////////////////////////////////////////////////////

		criteriaOven = new Criteria(Oven.class.getSimpleName());
		criteriaOven.add(Oven.HEIGHT.toString(), 200);
		criteriaOven.add(Oven.DEPTH.toString(), 300);

		devices = service.find(criteriaOven);

		PrintDeviceInfo.print(devices);

		//////////////////////////////////////////////////////////////////

		Criteria criteriaTabletPC = new Criteria(TabletPC.class.getSimpleName());
		criteriaTabletPC.add(TabletPC.COLOR.toString(), "blue");
		criteriaTabletPC.add(TabletPC.DISPLAY_INCHES.toString(), 14);
		criteriaTabletPC.add(TabletPC.MEMORY_ROM.toString(), 8000);

		devices = service.find(criteriaTabletPC);

		PrintDeviceInfo.print(devices);
	}
}