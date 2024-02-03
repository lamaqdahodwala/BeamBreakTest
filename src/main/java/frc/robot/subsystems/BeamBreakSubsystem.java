package frc.robot.subsystems;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class BeamBreakSubsystem extends SubsystemBase {
    private final DigitalInput m_beam; 
    public BeamBreakSubsystem(DigitalInput beam) {
        this.m_beam = beam;
    }
    private boolean isBroken = false;
    public boolean isBroken(){
        return this.isBroken;
    }

    @Override
    public void periodic(){
        this.isBroken = this.m_beam.get();
    }
}
