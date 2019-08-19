/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

/**
 * Add your docs here.
 */
public class Drivetrain extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.
      WPI_TalonSRX tfl;
      WPI_TalonSRX tfr;
      WPI_TalonSRX tbl;
      WPI_TalonSRX tbr;
      SpeedControllerGroup tr;
      SpeedControllerGroup tl;
      public DifferentialDrive tankDrive;
      /*
      tfl = Tank Front Left
      tfr = Tank Front Right
      tbl = Tank Back Left
      tbr = Tank Back Right
      tr = Tank Right
      tl = Tank Left
      */
      public Drivetrain(){
          tfl = new WPI_TalonSRX(0);
          tfr = new WPI_TalonSRX(1);
          tbl = new WPI_TalonSRX(2);
          tbr = new WPI_TalonSRX(3);
          tr = new SpeedControllerGroup(tfr, tbr);
          tl = new SpeedControllerGroup(tfl, tbl);
          tankDrive = new DifferentialDrive(tl, tr);
      }
  
  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
}
