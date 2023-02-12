package frc.robot.subsystems;

import edu.wpi.first.wpilibj.BuiltInAccelerometer;
import edu.wpi.first.wpilibj.interfaces.Accelerometer;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class AccelerometersSubsystem extends SubsystemBase {
    public static Accelerometer accelerometer = new BuiltInAccelerometer();
    public AccelerometersSubsystem() {

    }
    public static void debug() {
        SmartDashboard.putNumber("X",accelerometer.getX());
        SmartDashboard.putNumber("Y",accelerometer.getY());
        SmartDashboard.putNumber("Z",accelerometer.getZ());
    }
}
