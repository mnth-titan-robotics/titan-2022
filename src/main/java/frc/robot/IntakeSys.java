package frc.robot;

import edu.wpi.first.wpilibj.motorcontrol.Victor;

public class IntakeSys {

    private Victor Feeder_Belt;
    private Victor Feeder_Arm; 
    
    public IntakeSys() {
        this.Feeder_Belt = new Victor(RobotConstants.Feeder_Belt);
        this.Feeder_Arm = new Victor(RobotConstants.Feeder_Arm);
             
     }
     public void update(double IntakeyVacuum, double FArm, double FArmBack) {
         this.Feeder_Belt.set(IntakeyVacuum * 0.8);
         this.Feeder_Arm.set(FArm * -.8);
         this.Feeder_Arm.set(FArmBack * .8);
         }

    
    




}
