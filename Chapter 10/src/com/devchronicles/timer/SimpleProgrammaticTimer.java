package com.devchronicles.timer;

import javax.annotation.Resource;
import javax.ejb.Timeout;
import javax.ejb.TimerService;


public class SimpleProgrammaticTimer {
	@Resource
	TimerService timerService;

	public void setTimer() {
		timerService.createTimer(30000, "New timer");
	}

	@Timeout
	public void performTask() {
		System.out.println("Simple Task performed");
	}
}