package frc.robot;

import com.ctre.phoenix6.hardware.TalonFX;

import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class IntakeSubSystem extends SubsystemBase {

// here is the code for the intake subsystem
    TalonFX intakeExtenedMotor = new TalonFX(constants.intakeConstants.intakeExtenedMotor);
    TalonFX intakeRunMotor = new TalonFX(constants.intakeConstants.intakeRunMotor);
    public static Encoder extened_encoder = new Encoder(constants.intakeConstants.intakeEncoderChannelA, constants.intakeConstants.intakeEncoderChannelB);

    public void extenedIntake(){

       intakeExtenedMotor.set(constants.intakeConstants.intakeExtened);
       if (extened_encoder.getDistance() > constants.intakeConstants.intakeMaxOut) {
        intakeExtenedMotor.set(0);

       }

    }

    public void retractIntake(){
       intakeExtenedMotor.setVoltage(constants.intakeConstants.intakeRetract);
         if (extened_encoder.getDistance() <constants.intakeConstants.intakeMaxIn) {
          intakeExtenedMotor.set(0);
         }
    }

    public void runIntake(){
       intakeRunMotor.set(constants.intakeConstants.intakeRun);
    }

    public void stop(){
        intakeExtenedMotor.set(0);
        intakeRunMotor.set(0);
    }
}

