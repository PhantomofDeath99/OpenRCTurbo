package org.firstinspires.ftc.teamcode.Autonomous;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;


import org.firstinspires.ftc.teamcode.SeansSpace.SeansSubsystems.Driving.AutonomousPathing;
import org.firstinspires.ftc.teamcode.Subsystems.Driving.RobotComponents;
import org.firstinspires.ftc.teamcode.Subsystems.Driving.SeansEncLibrary;
import org.firstinspires.ftc.teamcode.Subsystems.Driving.Drivetrain;
import org.firstinspires.ftc.teamcode.Subsystems.Transitioning.AutoTransitioner;
import org.firstinspires.ftc.teamcode.Subsystems.VisionTargeting.SkystoneDetectionPhone;

@Autonomous(name = "Blue_Auto_V1", group = "Autonomous")
public class Blue_Auto_V1 extends LinearOpMode {


    private Drivetrain robot;
    boolean isSkystone;
    private RobotComponents mech;
    private AutonomousPathing path;
    //int position;
    SeansEncLibrary enc;
    SkystoneDetectionPhone phone;



    @Override
    public void runOpMode() throws InterruptedException {

        enc = new SeansEncLibrary(hardwareMap, telemetry, this);
        mech = new RobotComponents(hardwareMap,telemetry);

        waitForStart();




        //Position 1 (4 from wall)
        enc.steeringDrive( 48, false, false, 1);
        enc.steeringDrive(-24,false,false,1);
        //strafing here
        enc.gyroTurn(enc.TURN_SPEED, -90);
        mech.intakeStone();
        enc.gyroTurn(enc.TURN_SPEED, 180);
        enc.steeringDrive(80, false,false, 1);

        //sample
        //vision code goes here
        mech.intakeStone();
        enc.steeringDrive(-12,  false,false, 1);
        enc.gyroTurn(enc.TURN_SPEED, 90);
        enc.steeringDrive(80, false,false, 1);


// other side

        //24
        //turn 120
        // drive 40
        //turn 45
        //drive 32
        //vision
        //intake
        //back 32
        //turn 120
        //drive 45
        AutoTransitioner.transitionOnStop(this, "BasicTeleOp");//Transition to TeleOp
    }


}