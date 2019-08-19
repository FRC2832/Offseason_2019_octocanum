/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;


import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.MecanumDrive;

/**
 * Add your docs here.
 */
public class Drivetrain extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.
  WPI_TalonSRX mfl;
  WPI_TalonSRX mfr;
  WPI_TalonSRX mbl;
  WPI_TalonSRX mbr;
  MecanumDrive mecanumDrive;

  /*
  tfl = Tank Front Left
  tfr = Tank Front Right
  tbl = Tank Back Left
  tbr = Tank Back Right
  tr = Tank Right
  tl = Tank Left
  */  
      public Drivetrain(){
        mfl = new WPI_TalonSRX(0);
        mfr = new WPI_TalonSRX(1);
        mbl = new WPI_TalonSRX(2);
        mbr = new WPI_TalonSRX(3);
        mecanumDrive = new MecanumDrive(mfl, mbl, mfr, mbr);

      }
  
  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
  
  public void setMecanumDriveCommand(double ySpeed, double xSpeed, double zRotation, double gyroAngle){
    mecanumDrive.driveCartesian(ySpeed, xSpeed, zRotation);
  }
}
