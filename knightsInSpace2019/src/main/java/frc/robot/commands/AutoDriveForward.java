/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.subsystems.DriveTrain;

public class AutoDriveForward extends Command {

  private double m_time;
  private static DriveTrain m_DriveTrain;
  public AutoDriveForward(double distance, double speed) {
    // Use requires() here to declare subsystem dependencies
    // eg. requires(chassis);
    m_time = (distance-4.24)/31.8;// this is value for 0.65 (distance - 11.341)/75.024;
   // m_speed = speed;
    requires(m_DriveTrain);
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
    setTimeout(m_time);
  }
  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
    // m_drivetrain.drive(m_speed, -m_angle * Kp);
    // 	Timer.delay(0.01);
  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    return true;
  }

  // Called once after isFinished returns true
  @Override
  protected void end() {
    m_DriveTrain.stop();
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
    m_DriveTrain.stop();
  }
}
