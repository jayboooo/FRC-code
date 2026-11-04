package frc.robot;



import com.ctre.phoenix6.hardware.TalonFX;


public class ShootSubSytem {
    TalonFX motor = new TalonFX(3);


    public void setSpeed(double speed){
        motor.set(speed);
    }

    public double getAim(int distance){
        
    }

    public void stop(){
        motor.set(0);
    }
}
