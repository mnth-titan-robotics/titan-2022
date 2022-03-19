package frc.robot;

import edu.wpi.first.wpilibj.motorcontrol.Victor;

public class Shooter {

private Victor Shooter;
private Victor Shooter2;
public Shooter() {
    this.Shooter = new Victor(RobotConstants.MOTOR_SHOOTER);
    this.Shooter2 = new Victor(RobotConstants.REVERSE_MOTOR_SHOOTER);
}
public void update(double MOTOR_SHOOTER){
    Shooter.set(MOTOR_SHOOTER * 1);
    Shooter2.set(MOTOR_SHOOTER * -1);
    
}
public void autoUpdate(int Auto_Shooter){
    Shooter.set(Auto_Shooter);

    
}
}
