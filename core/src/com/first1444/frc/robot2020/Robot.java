package com.first1444.frc.robot2020;

import com.first1444.sim.api.frc.FrcDriverStation;
import com.first1444.sim.api.frc.IterativeRobotRunnable;

public class Robot extends IterativeRobotRunnable {
	private final FrcDriverStation driverStation;
	
	public Robot(FrcDriverStation driverStation) {
		super(driverStation::getMode);
		this.driverStation = driverStation;
		
		// treat the constructor (this is the constructor) as robotInit()
	}
	@Override
	protected void autonomousInit() {
	
	}
	
	@Override
	protected void autonomousPeriodic() {
	
	}
	
	@Override
	protected void disabledInit() {
	
	}
	
	@Override
	protected void disabledPeriodic() {
	
	}
	
	@Override
	protected void robotPeriodic() {
	
	}
	
	@Override
	protected void teleopInit() {
	
	}
	
	@Override
	protected void teleopPeriodic() {
	
	}
	
	@Override
	protected void testInit() {
	
	}
	
	@Override
	protected void testPeriodic() {
	
	}
}
