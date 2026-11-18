package frc.robot;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.ShootSubSytem;


public class RetractIntakeCommand extends Command {
  


        IntakeSubSystem intake = new IntakeSubSystem();
        public RetractIntakeCommand(IntakeSubSystem intake){
            this.intake = intake;
            addRequirements(intake);
        }


        public void initialize(){
             IntakeSubSystem.extened_encoder.reset();
        }

        public void execute(){
                intake.retractIntake();
            
            
        }

        public boolean isFinsished(){
                    return false;
        }

        public void end(boolean interrupted){
            intake.stop();
        }
}