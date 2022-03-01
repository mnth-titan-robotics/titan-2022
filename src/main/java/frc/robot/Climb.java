package frc.robot;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.PneumaticsModuleType;


public class Climb {


    private Compressor comp = new Compressor(0, null);
    private DoubleSolenoid Solenoid_1 = new DoubleSolenoid(PneumaticsModuleType.CTREPCM, RobotConstants.Solenoid_1_A, RobotConstants.Solenoid_1_B);
    private DoubleSolenoid Solenoid_2 = new DoubleSolenoid(PneumaticsModuleType.CTREPCM, RobotConstants.Solenoid_2_A, RobotConstants.Solenoid_2_B);
    private DoubleSolenoid Solenoid_3 = new DoubleSolenoid(PneumaticsModuleType.CTREPCM, RobotConstants.Solenoid_3_A, RobotConstants.Solenoid_3_B);
    private DoubleSolenoid Solenoid_4 = new DoubleSolenoid(PneumaticsModuleType.CTREPCM, RobotConstants.Solenoid_4_A, RobotConstants.Solenoid_4_B);
    public void update(DoubleSolenoid.Value armset1, DoubleSolenoid.Value armset2){

    }
}
