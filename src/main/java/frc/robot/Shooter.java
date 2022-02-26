package frc.robot;

import edu.wpi.first.wpilibj.motorcontrol.Victor;

public class Shooter {
    private Victor Motor_Shooter;
    public Shooter(){
        this.Motor_Shooter = new Victor(RobotConstants.MOTOR_SHOOTER);
    }
    public void update(boolean Shoot){
        if (Shoot){
            this.Motor_Shooter.set(1);
        }else{
            this.Motor_Shooter.set(0);
        }
    }
}
