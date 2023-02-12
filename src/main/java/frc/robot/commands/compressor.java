package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Constants;
import frc.robot.RobotContainer;

public class compressor extends CommandBase {
    public compressor() {
        addRequirements(RobotContainer.m_PS);
    }
    Boolean toggle = true;

    @Override
    public void initialize() {
//        RobotContainer.m_PS.setCompressor(true);
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        toggle = false;
        if (toggle){
            RobotContainer.m_PS.setCompressor(true);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            toggle = false;
        } else {
            RobotContainer.m_PS.setCompressor(false);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            toggle = true;
        }
    }



    @Override
    public void end(boolean interrupted) {
    }


    @Override
    public boolean isFinished() {
        return false;
    }
}
