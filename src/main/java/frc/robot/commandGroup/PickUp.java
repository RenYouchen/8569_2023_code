package frc.robot.commandGroup;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Commands;
import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import frc.robot.commands.compressor;
import frc.robot.commands.test;

public class PickUp extends SequentialCommandGroup {
    public PickUp() {
        addCommands(
                new compressor(),
                new test()
        );
    }
}
