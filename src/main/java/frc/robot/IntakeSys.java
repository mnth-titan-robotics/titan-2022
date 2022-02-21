package frc.robot;

import edu.wpi.first.wpilibj.motorcontrol.Victor;

public class IntakeSys {
    private double _upwardCommand;
    private double _downwardCommand;

    private Victor Feeder_Belt;
    private Victor Feeder_Arm; 
    
    public IntakeSys() {
        this.Feeder_Belt = new Victor(RobotConstants.Feeder_Belt);
        this.Feeder_Arm = new Victor(RobotConstants.Feeder_Arm);

        this.Feeder_Belt.setInverted(RobotConstants.MOTOR_INVERT_R );
        this.Feeder_Arm.setInverted(RobotConstants.MOTOR_INVERT_L);
    }
    
    




}
