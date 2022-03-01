package frc.robot;

import edu.wpi.first.wpilibj.motorcontrol.Victor;

public class Shooter {
    private Victor Shooter;
    public Shoot(){
        this.Shooter = new Victor(RobotConstants.MOTOR_SHOOTER);
    }
    public void update(boolean Shoot){
        if (Shoot){
            this.Shooter.set(1);
        }else{
            this.Shooter.set(0);
        }
    }
}
