package frc.robot;

import edu.wpi.first.wpilibj.Compressor;
<<<<<<< HEAD
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.PneumaticsModuleType;



public class Climb {


    private Compressor comp = new Compressor(0, null);
    private DoubleSolenoid Solenoid_1 = new DoubleSolenoid(PneumaticsModuleType.CTREPCM, RobotConstants.Solenoid_1_A, RobotConstants.Solenoid_1_B);
    private DoubleSolenoid Solenoid_2 = new DoubleSolenoid(PneumaticsModuleType.CTREPCM, RobotConstants.Solenoid_2_A, RobotConstants.Solenoid_2_B);
    private DoubleSolenoid Solenoid_3 = new DoubleSolenoid(PneumaticsModuleType.CTREPCM, RobotConstants.Solenoid_3_A, RobotConstants.Solenoid_3_B);
    private DoubleSolenoid Solenoid_4 = new DoubleSolenoid(PneumaticsModuleType.CTREPCM, RobotConstants.Solenoid_4_A, RobotConstants.Solenoid_4_B);
    public void update(DoubleSolenoid.Value armset1, DoubleSolenoid.Value armset2){

       { 
        Solenoid_1.set(armset1);
        Solenoid_3.set(armset1);
        Solenoid_2.set(armset2);
        Solenoid_4.set(armset2);
       }
    }  
 }
=======
import edu.wpi.first.wpilibj.PneumaticsModuleType;

//import edu.wpi.first.wpilibj.Solenoid;
//import static edu.wpi.first.wpilibj.DoubleSolenoid.Value.*;

public class Climb {
    Compressor pcmCompressor = new Compressor(0, PneumaticsModuleType.CTREPCM);
    boolean enabled = pcmCompressor.enabled();
    boolean pressureSwitch = pcmCompressor.getPressureSwitchValue();
    double current = pcmCompressor.getCurrent();
}
//This represents code if we want data from Pnuematics 
// https://docs.wpilib.org/en/stable/docs/software/hardware-apis/pneumatics/pneumatics.html
// boolean enabled = pcmCompressor.enabled();
// boolean pressureSwitch = pcmCompressor.getPressureSwitchValue();
// double current = pcmCompressor.getCompressorCurrent();
>>>>>>> bf1dbc8dc67969baae8adf160d32ae30aad19bc7
