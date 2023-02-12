package frc.robot.subsystems;

import edu.wpi.first.math.Pair;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.shuffleboard.Shuffleboard;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.kauailabs.navx.frc.AHRS;

import static edu.wpi.first.wpilibj.DriverStation.isEnabled;

public class AHRSSubsystem extends SubsystemBase {
    public static AHRS ahrs = new AHRS();
//    static final double kOffBalanceAngleThresholdDegrees = 10;
//    static final double kOonBalanceAngleThresholdDegrees  = 5;
//    static boolean autoBalanceXMode = false;
//    static boolean autoBalanceYMode = false;
    public AHRSSubsystem() {

    }
//    public Pair<Double,Double> operatorControl(double xAxisRate, double yAxisRate) {
//        while (true) {
//
//            double pitchAngleDegrees    = ahrs.getPitch();
//            double rollAngleDegrees     = ahrs.getRoll();
//
//            if ( !autoBalanceXMode &&
//                    (Math.abs(pitchAngleDegrees) >=
//                            Math.abs(kOffBalanceAngleThresholdDegrees))) {
//                autoBalanceXMode = true;
//            }
//            else if ( autoBalanceXMode &&
//                    (Math.abs(pitchAngleDegrees) <=
//                            Math.abs(kOonBalanceAngleThresholdDegrees))) {
//                autoBalanceXMode = false;
//            }
//            if ( !autoBalanceYMode &&
//                    (Math.abs(pitchAngleDegrees) >=
//                            Math.abs(kOffBalanceAngleThresholdDegrees))) {
//                autoBalanceYMode = true;
//            }
//            else if ( autoBalanceYMode &&
//                    (Math.abs(pitchAngleDegrees) <=
//                            Math.abs(kOonBalanceAngleThresholdDegrees))) {
//                autoBalanceYMode = false;
//            }
//
//            // Control drive system automatically,
//            // driving in reverse direction of pitch/roll angle,
//            // with a magnitude based upon the angle
//
//            if ( autoBalanceXMode ) {
//                double pitchAngleRadians = pitchAngleDegrees * (Math.PI / 180.0);
//                xAxisRate = Math.sin(pitchAngleRadians) * -1;
//            }
//            if ( autoBalanceYMode ) {
//                double rollAngleRadians = rollAngleDegrees * (Math.PI / 180.0);
//                yAxisRate = Math.sin(rollAngleRadians) * -1;
//            }
//            return new Pair<>(xAxisRate,yAxisRate);
//
//        }
//        //return new Pair<>(1.0,1.0);
//    }
    public static void debug() {
    }
}
