package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Constants;
import frc.robot.RobotContainer;

public class test2 extends CommandBase {
    public test2() {
        addRequirements(RobotContainer.m_AHRS);
    }

    @Override
    public void initialize() {

    }

    @Override
    public void execute() {
        RobotContainer.m_AHRS.debug();
    }

    @Override
    public void end(boolean interrupted) {
    }


    @Override
    public boolean isFinished() {
        return false;
    }
}
