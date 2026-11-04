package frc.robot;

import edu.wpi.first.wpilibj2.command.Command;

    public class ShootCommand extends Command {

        int distance = 1;
        public ShootCommand(ShootSubSytem Shoot){
            this.Shoot = Shoot;
            addRequirements(Shoot);
        }


        public void initialize(){
            ShootCommand.setSpeed(1);
        }

        public void execute(){
            double shootSpeed = ShootCommand.getAim(distance);
            if(shootSpeed > 1){
                shootSpeed = 1;
            }else if(shootSpeed < -1){
                shootSpeed = -1;
            }
            ShootCommand.setSpeed(shootSpeed);
            
        }

        public boolean isFinsished(){
            return false;

        }

        public void end(boolean interrupted){

            ShootCommand.setSpeed(0);
        }







    }

    

