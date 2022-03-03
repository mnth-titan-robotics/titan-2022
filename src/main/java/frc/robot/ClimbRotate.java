package frc.robot;
import edu.wpi.first.wpilibj.motorcontrol.Victor;
public class ClimbRotate {
    private Victor MOTOR_ARMSET1;
    private Victor MOTOR_ARMSET2;
 {
    this.MOTOR_ARMSET1 = new Victor(RobotConstants.ARMSET1_MOTOR);
    this.MOTOR_ARMSET1 = new Victor(RobotConstants.ARMSET2_MOTOR);
 }
   public void update(double MOTOR_ARMSET1, double MOTOR_ARMSET2){
       this.MOTOR_ARMSET1.set(RobotConstants.ARMSET1_MOTOR);
       this.MOTOR_ARMSET2.set(RobotConstants.ARMSET2_MOTOR);
   } 
}
