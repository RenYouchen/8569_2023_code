package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Constants;
import frc.robot.RobotContainer;

public class test extends CommandBase {
    public test() {
        addRequirements(RobotContainer.m_PS);
    }
    private Boolean toggle = true;
    @Override
    public void initialize() {
        if (toggle){
            RobotContainer.m_PS.forward();
            toggle = false;
        } else {
            RobotContainer.m_PS.reverse();
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
