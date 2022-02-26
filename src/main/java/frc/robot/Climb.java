package frc.robot;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.PneumaticsModuleType;


public class Climb {
    private DoubleSolenoid _Solenoid_1;
    private DoubleSolenoid _Solenoid_2;
    private DoubleSolenoid _Solenoid_3;
    private DoubleSolenoid _Solenoid_4;
    private boolean _climbExtendRetractPrimary;

public static Compressor comp = new Compressor(0, null);
public static DoubleSolenoid Solenoid_1 = new DoubleSolenoid(null, 0, 1);
public static DoubleSolenoid Solenoid_2 = new DoubleSolenoid(null, 2, 3);
public static DoubleSolenoid Solenoid_3 = new DoubleSolenoid(null, 4, 5);
public static DoubleSolenoid Solenoid_4 = new DoubleSolenoid(null, 6, 7);
public void update(boolean climb){

if (climb)
    { 
   
   //Solenoid_3.set(DoubleSolenoid.Value.kForward);
}

   //Solenoid_3.set(DoubleSolenoid.Value.kReverse);
}
}
