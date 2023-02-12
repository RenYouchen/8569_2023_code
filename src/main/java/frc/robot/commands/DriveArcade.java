// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.math.Pair;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Constants;
import frc.robot.RobotContainer;

public class DriveArcade extends CommandBase {
    Pair<Double, Double> XY;
    public DriveArcade() {
        addRequirements(RobotContainer.m_Drivetrain);
        addRequirements(RobotContainer.m_AHRS);
    }

    @Override
    public void execute() {
        double moveSpeed = RobotContainer.driverController.getRawAxis(Constants.DRIVER_CONTROLLER_MOVE_AXIS);
        double rotationSpeed = RobotContainer.driverController.getRawAxis(Constants.DRIVER_CONTROLLER_ROTATE_AXIS);
//        XY = RobotContainer.m_AHRS.operatorControl(moveSpeed,rotationSpeed);
//        Timer.delay(0.005);		// wait for a motor update timeT
        RobotContainer.m_Drivetrain.arcadeDrive(-rotationSpeed * Constants.DRIVE_MAX_SPEED, moveSpeed * Constants.DRIVE_MAX_SPEED);
    }

    @Override
    public void end(boolean interrupted) {
        RobotContainer.m_Drivetrain.arcadeDrive(0, 0);
    }


    @Override
    public boolean isFinished() {
        return false;
    }
}
