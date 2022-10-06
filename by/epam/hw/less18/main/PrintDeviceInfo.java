package by.epam.hw.less18.main;

import java.util.List;

import by.epam.hw.less18.entity.Device;

public class PrintDeviceInfo {
	public static void print(List<Device> devices) {
		for (int i = 0; i < devices.size(); i++) {
			System.out.println(devices.get(i));
		}
	}
}