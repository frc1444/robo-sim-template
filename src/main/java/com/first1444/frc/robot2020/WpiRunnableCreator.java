package com.first1444.frc.robot2020;

import com.first1444.sim.api.RunnableCreator;
import com.first1444.sim.api.frc.FrcDriverStation;
import com.first1444.sim.wpi.frc.WpiFrcDriverStation;
import edu.wpi.first.wpilibj.DriverStation;

public class WpiRunnableCreator implements RunnableCreator {
	
	@Override
	public Runnable createRunnable() {
		return new Robot(
				new WpiFrcDriverStation(DriverStation.getInstance())
		);
	}
	
	@Override
	public void prematureInit() {
	
	}
}
