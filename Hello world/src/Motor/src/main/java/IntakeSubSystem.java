import com.ctre.phoenix6.hardware.TalonFX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class IntakeSubSystem extends SubsystemBase {


    TalonFX intakeExtenedMotor = new TalonFX(3);
    TalonFX intakeRunMotor = new TalonFX(4);


    public void extenedIntake(){
       
    }

    public void retractIntake(){

    }

    public void runIntake(){

    }

    public void stop(){
        intakeExtenedMotor.set(0);
        intakeRunMotor.set(0);
    }
}

