package frc.robot;

import edu.wpi.first.wpilibj.PneumaticHub;
import edu.wpi.first.wpilibj.PneumaticsModuleType;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.DoubleSolenoid;


public class Climb {

public static Compressor comp = new Compressor(0, PneumaticsModuleType.CTREPCM);
public static DoubleSolenoid Solenoid_1 = new DoubleSolenoid(null, 0, 1);
public static DoubleSolenoid Solenoid_2 = new DoubleSolenoid(null, 2, 3);
public static DoubleSolenoid Solenoid_3 = new DoubleSolenoid(null, 4, 5);
public static DoubleSolenoid Solenoid_4 = new DoubleSolenoid(null, 6, 7);
}
