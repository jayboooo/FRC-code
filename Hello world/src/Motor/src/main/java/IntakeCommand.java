import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.ShootSubSytem;

public class IntakeCommand extends Command {


        IntakeSubSystem intake = new IntakeSubSystem();
        public IntakeCommand(IntakeSubSystem intake){
            this.intake = intake;
            addRequirements(intake);
        }


        public void initialize(){
            XboxController controller = new XboxController(1);
        }

        public void execute(){
          if(controller.aButton.get()){
            intake.runIntake();
          }else if(controller.bButton.get()){
            intake.extenedIntake();
            }else if(controller.xButton.get()){
                intake.retractIntake();
            }
            
        }

        public boolean isFinsished(){
                    return false;
        }

        public void end(boolean interrupted){
            intake.stop();
        }








}