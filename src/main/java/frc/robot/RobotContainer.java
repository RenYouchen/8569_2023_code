// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;


import com.kauailabs.navx.frc.AHRS;
import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.CommandBase;
import edu.wpi.first.wpilibj2.command.button.CommandJoystick;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import frc.robot.commandGroup.PickUp;
import frc.robot.commands.*;
//import frc.robot.commands.ShooterRotateMethod;
import frc.robot.subsystems.*;
import edu.wpi.first.wpilibj2.command.Command;

/**
 * This class is where the bulk of the robot should be declared. Since Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in the {@link Robot}
 * periodic methods (other than the scheduler calls). Instead, the structure of the robot (including
 * subsystems, commands, and button mappings) should be declared here.
 */
public class RobotContainer {
    // The robot's subsystems and commands are defined here...
    public static final Drivetrain m_Drivetrain = new Drivetrain();
    public static final PneumaticsSubsystem m_PS = new PneumaticsSubsystem();
    public static final AccelerometersSubsystem m_AS = new AccelerometersSubsystem();
    public static final AHRSSubsystem m_AHRS = new AHRSSubsystem();

    private final ExampleSubsystem m_exampleSubsystem = new ExampleSubsystem();

    private final ExampleCommand m_autoCommand = new ExampleCommand(m_exampleSubsystem);
    private final test m_test = new test();
    private final test2 m_test2 = new test2();

    public static CommandJoystick commandJoystick = new CommandJoystick(Constants.DRIVER_CONTROLLER);

    public static Joystick driverController = new Joystick(Constants.DRIVER_CONTROLLER);
    public static JoystickButton testB = new JoystickButton(driverController,Constants.BUTTON_A);
    public static JoystickButton testB2 = new JoystickButton(driverController,Constants.BUTTON_X);
    public static JoystickButton com = new JoystickButton(driverController,Constants.BUTTON_B);

    /**
     * The container for the robot. Contains subsystems, OI devices, and commands.
     */
    public RobotContainer() {
        // Configure the button bindings
        configureButtonBindings();
        m_PS.setDefaultCommand(new stopCompressor());
        m_AHRS.setDefaultCommand(new test2());
        m_AS.setDefaultCommand(new test2());
        // Set the default drive command to split-stick arcade drive
        //m_Drivetrain.setDefaultCommand(new DriveArcade());
    }

    /**
     * Use this method to define your button->command mappings. Buttons can be created by
     * instantiating a {@link GenericHID} or one of its subclasses ({@link
     * Joystick} or {@link XboxController}), and then passing it to a {@link
     * JoystickButton}.
     */
    private void configureButtonBindings() {
        testB.whileTrue(new test2());
        testB2.whileTrue(new compressor()).whileFalse(new test());
        com.whileTrue(new compressor());
    }

    /**
     * Use this to pass the autonomous command to the main {@link Robot} class.
     *
     * @return the command to run in autonomous
     */
    public Command getAutonomousCommand() {
        // An ExampleCommand will run in autonomous
        return m_autoCommand;
    }
}
