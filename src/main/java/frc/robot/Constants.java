// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
    //CAMERA
    public static final double CAMERA_HEIGHT_METERS = 0.0;
    public static final double TARGET_HEIGHT_METERS = 0.0;
    public static final double CAMERA_PITCH_RADIANS = 0.0;

    //Drivetrain&motor
    public static final int DRIVETRAIN_LEFT_FRONT = 3;
    public static final int DRIVETRAIN_LEFT_BACK = 4;
    public static final int DRIVETRAIN_RIGHT_FRONT = 1;
    public static final int DRIVETRAIN_RIGHT_BACK = 2;
    //TODO change motor can id
    public static final int INTAKE_MOTOR = 6;
    public static final int SHOOTER_MOTOR_A = 5;
    public static final int SHOOTER_MOTOR_B = 7;
    //public static final int SHOOTER_ROTATE_MOTOR = 7;
    public static final int INSIDE_INTAKE_MOTIR = 8;

    //Motor speed
    public static final double INTAKE_SPEED = 1;
    public static final double SHOOTER_SPEED = 0.5;
    public static final double SHOOTER_ROTATE_SPEED = 1;
    public static final double MOTOR_STOP = 0;
    public static final double DRIVE_MAX_SPEED = 0.85;

    //Joystick
    public static final int DRIVER_CONTROLLER = 0;
    public static final int DRIVER_CONTROLLER_MOVE_AXIS = 1;
    public static final int DRIVER_CONTROLLER_ROTATE_AXIS = 4;
    public static final int DRIVER_CONTROLLER_LTRIGGER_AXIS = 2;
    public static final int DRIVER_CONTROLLER_RTRIGGER_AXIS = 3;

    public static final int BUTTON_A = 2;
    public static final int BUTTON_B = 3;
    public static final int BUTTON_X = 1;
    public static final int BUTTON_Y = 4;
    public static final int BUTTON_LB = 5;
    public static final int BUTTON_RB = 6;
    public static final int BUTTON_BACK = 7;
    public static final int BUTTON_START = 8;
    public static final int BUTTON_LEFT_STICK = 9;
    public static final int BUTTON_RIGHT_STICK = 10;
}