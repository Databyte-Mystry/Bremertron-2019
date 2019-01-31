/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
  //Drive Train Motor Assingments
  public static int Front_Left_Motor = 1;
  public static int Front_Right_Motor = 2;
  public static int Rear_Left_Motor = 3;
  public static int Rear_Right_Motor = 4;

  //Piston Assignments
  public static int Front_Wheel_Piston = 0;
  public static int Rear_Wheel_Piston = 1;
  public static int Launcher_Piston = 2;
  public static int Hatch_Pistion = 3;

  //Launcher Motor Assignments
  public static int Launcher_Motor = 5;

  //Encoder Assignments
  public static int Left_EncoderA = 1;
  public static int Left_EncoderB = 2;
  public static int Right_EncoderA = 3;
  public static int Right_EncoderB = 4;

  // If you are using multiple modules, make sure to define both the port
  // number and the module. For example you with a rangefinder:
  // public static int rangefinderPort = 1;
  // public static int rangefinderModule = 1;
}
