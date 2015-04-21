package com.devchronicles.timer;

import javax.ejb.Schedule;
import javax.ejb.Schedules;

public class PeriodicTimer {
	@Schedules({ @Schedule(dayOfMonth = "1"),
			@Schedule(dayOfWeek = "Mon,Tue,Wed,Thu,Fri", hour = "8") })
	public void executeTask() {
		System.out.println("Task performed");
	}
}