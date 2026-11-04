package frc.robot;



import com.ctre.phoenix6.hardware.TalonFX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;


public class ShootSubSytem extends SubsystemBase {
    TalonFX motor = new TalonFX(3);


    public void setSpeed(double speed){
        motor.set(speed);
    }

    public double getAim(double distance){
        // Implementation for calculating aim based on distance
        return 2000*distance;
    }

    public void stop(){
        motor.set(0);
    }
}
