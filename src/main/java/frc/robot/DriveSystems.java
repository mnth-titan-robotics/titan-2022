package frc.robot;
import edu.wpi.first.wpilibj.motorcontrol.Victor;
public class DriveSystems {

    private Victor Motor_FLD;
    private Victor Motor_BLD;
    private Victor Motor_FRD;
    private Victor Motor_BRD;

    public DriveSystems(){
        this.Motor_FLD = new Victor(RobotConstants.MOTOR_CHANNEL_FLD);
        this.Motor_BLD = new Victor(RobotConstants.MOTOR_CHANNEL_BLD);
        this.Motor_FRD = new Victor(RobotConstants.MOTOR_CHANNEL_FRD);
        this.Motor_BRD = new Victor(RobotConstants.MOTOR_CHANNEL_BRD);

        this.Motor_FLD.setInverted(RobotConstants.MOTOR_INVERT_L);
        this.Motor_BLD.setInverted(RobotConstants.MOTOR_INVERT_L);
        this.Motor_FRD.setInverted(RobotConstants.MOTOR_INVERT_R);
        this.Motor_BRD.setInverted(RobotConstants.MOTOR_INVERT_R);
    }
    public void update(double LMove, double Rmove){
        this.Motor_BLD.set(LMove);
        this.Motor_BRD.set(Rmove);
        this.Motor_FLD.set(LMove);
        this.Motor_FRD.set(Rmove);

        

    }
}