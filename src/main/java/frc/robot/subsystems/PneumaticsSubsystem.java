package frc.robot.subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.PneumaticsModuleType;
import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class PneumaticsSubsystem extends SubsystemBase{
    private final Compressor compressor = new Compressor(0,PneumaticsModuleType.CTREPCM);
    private final DoubleSolenoid doubleS = new DoubleSolenoid(PneumaticsModuleType.CTREPCM,0,1);
    //private final Solenoid S = new Solenoid(PneumaticsModuleType.CTREPCM,0);
    public void setCompressor(Boolean status) {
        if (status) {
            compressor.enableDigital();
            SmartDashboard.putNumber("a",compressor.getCurrent());
        } else {
            compressor.disable();
        }
    }
    public void forward() {
        //S.set(true);
        doubleS.set(DoubleSolenoid.Value.kForward);
    }
    public void reverse() {
        //S.set(false);
        doubleS.set(DoubleSolenoid.Value.kReverse);
    }
    public void off() {

        doubleS.set(DoubleSolenoid.Value.kOff);
    }
}
