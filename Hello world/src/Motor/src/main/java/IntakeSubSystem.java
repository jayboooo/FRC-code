import com.ctre.phoenix6.hardware.TalonFX;

import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class IntakeSubSystem extends SubsystemBase {


    TalonFX intakeExtenedMotor = new TalonFX(3);
    TalonFX intakeRunMotor = new TalonFX(4);
    Encoder extened_encoder = new Encoder(0, 1);
    extened_encoder.reset();


    public void extenedIntake(){
       intakeExtenedMotor.set(0.5);
       if (extened_encoder.getDistance() > 100) {
        intakeExtenedMotor.set(0);
        
       }

    }

    public void retractIntake(){
       intakeExtenedMotor.set(-0.5);
         if (extened_encoder.getDistance() < 0) {
          intakeExtenedMotor.set(0);
    }

    public void runIntake(){
       intakeRunMotor.set(0.8);
    }

    public void stop(){
        intakeExtenedMotor.set(0);
        intakeRunMotor.set(0);
    }
}

