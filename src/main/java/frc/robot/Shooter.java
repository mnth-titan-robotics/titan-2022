package frc.robot;

import edu.wpi.first.wpilibj.motorcontrol.Victor;

public class Shooter {
    private Victor Shooter;
    public Shooter() {
        this.Shooter = new Victor(RobotConstants.MOTOR_SHOOTER);
    }
    public void update(Double ShootingMotor){
    Shooter.set(ShootingMotor);
            
    }
}
