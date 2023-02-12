package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.RobotContainer;

public class stopCompressor extends CommandBase {
    public stopCompressor(){
        addRequirements(RobotContainer.m_PS);
    }
    @Override
    public void initialize() {
        RobotContainer.m_PS.setCompressor(false);
    }
}
