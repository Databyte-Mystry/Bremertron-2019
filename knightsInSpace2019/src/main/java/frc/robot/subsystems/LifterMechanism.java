/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;

/**
 * Add your docs here.
 */
public class LifterMechanism extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.
  private static Solenoid ForePistons = new Solenoid(RobotMap.Front_Wheel_Pistons);
  private static Solenoid AftPistons = new Solenoid(RobotMap.Rear_Wheel_Pistons);

  public void setPistonHeight(boolean height, Solenoid piston){
    piston.set(height);
  }
  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
}