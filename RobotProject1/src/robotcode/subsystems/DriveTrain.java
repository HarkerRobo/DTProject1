/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package robotcode.subsystems;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 * @author Divija
 */
public class DriveTrain extends Subsystem {
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
private Talon talon1, talon2, talon3, talon4;

public DriveTrain(){
talon1 = new Talon(1);
talon2 = new Talon(2);
talon3 = new Talon(3);
talon4 = new Talon(4);
}

public void moveBackward(){
  talon1.set(-1);
  talon2.set(-1);
  talon3.set(-1);
  talon4.set(-1);
}

public void customSpeed(double left, double right){
   talon1.set(left);
   talon2.set(left);
   talon3.set(right);
   talon4.set(right);
}

public void stop(){
    talon1.set(0);
    talon2.set(0);
    talon3.set(0);
    talon4.set(0);
}

public void moveForward(){
    talon1.set(1);
    talon2.set(2);
    talon3.set(3);
    talon4.set(4);
}
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}
