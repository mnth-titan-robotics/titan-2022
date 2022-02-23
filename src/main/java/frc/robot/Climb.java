package frc.robot;

import pabeles.concurrency.ConcurrencyOps.Reset;
//import edu.wpi.first.wpilibj.PneumaticHub;
//import edu.wpi.first.wpilibj.PneumaticsModuleType;
//import edu.wpi.first.wpilibj.Solenoid;
//import edu.wpi.first.wpilibj.Joystick.ButtonType;
//import edu.wpi.first.wpilibj2.command.button.Button;
//import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.PneumaticsModuleType;


public class Climb {
    private DoubleSolenoid _Solenoid_1;
    private DoubleSolenoid _Solenoid_2;
    private DoubleSolenoid _Solenoid_3;
    private DoubleSolenoid _Solenoid_4;
    private boolean _climbExtendRetractPrimary;

    public Climb() {

        //public static Compressor comp = new Compressor(0, null);
        this._Solenoid_1 = new DoubleSolenoid(PneumaticsModuleType.CTREPCM, RobotConstants.Solenoid_1_A, RobotConstants.Solenoid_1_B);
        
        //Update the next few lines to match the example from Solenoid #1
        //public static DoubleSolenoid Solenoid_2 = new DoubleSolenoid(null, 2, 3);
        //public static DoubleSolenoid Solenoid_3 = new DoubleSolenoid(null, 4, 5);
        //public static DoubleSolenoid Solenoid_4 = new DoubleSolenoid(null, 6, 7);
        this.reset();
    }
    
    public void reset() {
        //reset will move pneumatics system to default retracted state
        this._Solenoid_1.set(DoubleSolenoid.Value.kReverse);
    }

    public void update(boolean _climbExtendRetractPrimary){
        if(_climbExtendRetractPrimary == true){
            this._Solenoid_1.set(DoubleSolenoid.Value.kForward);
        }
        else{
            this._Solenoid_1.set(DoubleSolenoid.Value.kReverse);
        }
    }
//if(JOYSTICK_PORT_COPILOT.getrawButton(1) == true)
    { 
   
   //Solenoid_3.set(DoubleSolenoid.Value.kForward);
}

   //Solenoid_3.set(DoubleSolenoid.Value.kReverse);
}
