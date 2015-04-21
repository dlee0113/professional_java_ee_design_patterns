package com.devchronicles.timer;

import java.util.Collection;
import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.ejb.Timer;
import javax.ejb.TimerService;


@Singleton
@Startup
public class AllTimers {
	@Resource
	TimerService timerService;

	@PostConstruct
	public void manageTimer() {
		Collection<Timer> timers = timerService.getAllTimers();
		for (Timer t : timers) {
			System.out.println("Timer Info: " + t.getInfo());
			System.out.println("Time Remaining: " + t.getTimeRemaining());
			t.cancel();
		}
	}
}