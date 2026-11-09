import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.ShootSubSytem;

public class IntakeCommand extends Command {

        IntakeSubSystem intake = new IntakeSubSystem();
        public IntakeCommand(IntakeSubSystem intake){
            this.intake = intake;
            addRequirements(intake);
        }


        public void initialize(){
            
        }

        public void execute(){
          
            
        }

        public boolean isFinsished(){
                    return false;
        }

        public void end(boolean interrupted){
            intake.stop();
        }








}