// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class Drivetrain extends SubsystemBase {
    CANSparkMax leftFrontMotor = null;
    CANSparkMax leftBackMotor = null;
    CANSparkMax rightFrontMotor = null;
    CANSparkMax rightBackMotor = null;

    MotorControllerGroup leftMotors = null;
    MotorControllerGroup rightMotors = null;

    DifferentialDrive differentialDrive = null;

    public Drivetrain() {
        leftFrontMotor = new CANSparkMax(Constants.DRIVETRAIN_LEFT_FRONT, MotorType.kBrushed);
        leftBackMotor = new CANSparkMax(Constants.DRIVETRAIN_LEFT_BACK, MotorType.kBrushed);
        rightFrontMotor = new CANSparkMax(Constants.DRIVETRAIN_RIGHT_FRONT, MotorType.kBrushed);
        rightBackMotor = new CANSparkMax(Constants.DRIVETRAIN_RIGHT_BACK, MotorType.kBrushed);

        leftMotors = new MotorControllerGroup(leftFrontMotor, leftBackMotor);
        rightMotors = new MotorControllerGroup(rightFrontMotor, rightBackMotor);

        differentialDrive = new DifferentialDrive(leftMotors, rightMotors);
    }

    public void arcadeDrive(double moveSpeed, double rotationSpeed) {
        differentialDrive.arcadeDrive(moveSpeed, rotationSpeed);
    }
}