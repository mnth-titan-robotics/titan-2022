package frc.robot;

import edu.wpi.first.wpilibj.PneumaticHub;
import edu.wpi.first.wpilibj.PneumaticsModuleType;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.Joystick.ButtonType;
import edu.wpi.first.wpilibj2.command.button.Button;
import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.DoubleSolenoid;


public class Climb {

public static Compressor comp = new Compressor(0, null);
public static DoubleSolenoid Solenoid_1 = new DoubleSolenoid(null, 0, 1);
public static DoubleSolenoid Solenoid_2 = new DoubleSolenoid(null, 2, 3);
public static DoubleSolenoid Solenoid_3 = new DoubleSolenoid(null, 4, 5);
public static DoubleSolenoid Solenoid_4 = new DoubleSolenoid(null, 6, 7);

{
if(JOYSTICK_PORT_COPILOT.getrawButton(1) == true)
    { 
   Solenoid_1.set(DoubleSolenoid.Value.kForward);
   Solenoid_3.set(DoubleSolenoid.Value.kForward);
}
else
    {
   Solenoid_1.set(DoubleSolenoid.Value.kReverse);
   Solenoid_3.set(DoubleSolenoid.Value.kReverse);
}


}
}