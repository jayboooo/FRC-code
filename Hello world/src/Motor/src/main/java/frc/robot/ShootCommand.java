package frc.robot;

import edu.wpi.first.wpilibj2.command.Command;

    public class ShootCommand extends Command {

        int distance = 1;
        ShootSubSytem Shoot = new ShootSubSytem();
        public ShootCommand(ShootSubSytem Shoot){
            this.Shoot = Shoot;
            addRequirements(Shoot);
        }


        public void initialize(){
            Shoot.setSpeed(1);
        }

        public void execute(){
            double shootSpeed = Shoot.getAim(distance);
            if(shootSpeed > 1){
                shootSpeed = 1;
            }else if(shootSpeed < -1){
                shootSpeed = -1;
            }
            Shoot.setSpeed(shootSpeed);
            
        }

        public boolean isFinsished(){
            return false;

        }

        public void end(boolean interrupted){

            Shoot.stop();
        }







    }

    

