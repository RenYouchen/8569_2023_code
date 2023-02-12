package frc.robot.commands;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.RobotContainer;

public class commandTest extends CommandBase {
    private static int count;
    @Override
    public void initialize() {
        count = 0;
    }

    @Override
    public void execute() {
        count++;
    }
    @Override
    public void end(boolean interrupted) {
        SmartDashboard.putNumber("test",count);
    }


    @Override
    public boolean isFinished() {
        return count == 10;
    }
}
