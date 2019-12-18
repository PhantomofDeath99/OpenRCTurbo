package org.firstinspires.ftc.teamcode.MkI.Autonomous;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.util.ElapsedTime;

import org.firstinspires.ftc.teamcode.MkI.Subsystems.Driving.RobotComponents;
import org.firstinspires.ftc.teamcode.MkI.Subsystems.Driving.SeansEncLibrary;
import org.firstinspires.ftc.teamcode.MkI.Subsystems.Transitioning.AutoTransitioner;

@Autonomous (name = "Red Auto Foundation" , group = "MkI Red Auto" )
public class Red_Auto_V2 extends LinearOpMode {


    ElapsedTime etime = new ElapsedTime();

        public void waitFor(int time) {
            time = time / 1000;
            etime.reset();
            while ((etime.time() < time) && (opModeIsActive())) {
                idle();
            }
    }

    @Override
    public void runOpMode() throws InterruptedException {

        //int position;
        SeansEncLibrary enc = new SeansEncLibrary(hardwareMap, telemetry, this);
            RobotComponents bacon = new RobotComponents(hardwareMap);


        enc.init();


        waitForStart();


        enc.steeringDrive(-21, false,false);
        enc.steeringDrive(-6.5, false,false);
        enc.steeringDrive(-11.5, false, true);
        bacon.foundationRelease();
        waitFor(2000);
        enc.steeringDrive(29,false,false);
        bacon.foundationGrab();
        enc.steeringDrive(30,false,true);

        enc.steeringDrive(-22,false,false);
        enc.gyroTurn(enc.TURN_SPEED,90);
        enc.steeringDrive(24, false, false);

//        //vision code goes here
//        mech.intakeStone();
//        enc.steeringDrive(-12, false);
//        enc.gyroTurn(enc.TURN_SPEED, 90);
//        enc.steeringDrive(80, false);

        AutoTransitioner.transitionOnStop(this,"MkITeleOp");
    }
}




