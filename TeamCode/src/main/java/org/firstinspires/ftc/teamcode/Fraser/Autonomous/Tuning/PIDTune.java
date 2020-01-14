package org.firstinspires.ftc.teamcode.Fraser.Autonomous.Tuning;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.util.ElapsedTime;

import org.firstinspires.ftc.teamcode.Fraser.Subsystems.Drive.FraserComponents;
import org.firstinspires.ftc.teamcode.Fraser.Subsystems.Drive.SeansEncLibrary;

@Autonomous(name = "PID Test", group = "Tuning")
public class PIDTune extends LinearOpMode {

    private ElapsedTime etime = new ElapsedTime();

    public void waitFor(int time){
        time = time/1000;
        etime.reset();
        while ((etime.time() < time)&&(opModeIsActive())) {
            idle();
        }
    }

    @Override
    public void runOpMode(){

        //int position;
        SeansEncLibrary enc = new SeansEncLibrary(hardwareMap, telemetry, this);
        FraserComponents component = new FraserComponents(hardwareMap);

        enc.init();

        waitForStart();

        enc.gyroTurn(1,90);

//        telemetry.addLine("Forward no toggle");
//        telemetry.update();
//        enc.steeringDrive(24, false,false);
//        waitFor(1000);
//        telemetry.addLine("Backward no toggle");
//        telemetry.update();
//        enc.steeringDrive(-24, false,false);
//        waitFor(1000);
//        telemetry.addLine("Left no toggle");
//        telemetry.update();
//        enc.steeringDrive(-24, false,true);
//        waitFor(3000);
//        telemetry.addLine("Right no toggle");
//        telemetry.update();
//        enc.steeringDrive(24, false,true);
//        waitFor(1000);

//
//        telemetry.addLine("Forward with toggle");
//        telemetry.update();
//        enc.steeringDrive(24, true,false);
//        waitFor(1000);
//        telemetry.addLine("Backward with toggle");
//        telemetry.update();
//        enc.steeringDrive(-24, true,false);
//        waitFor(1000);
//        telemetry.addLine("Left with toggle");
//        telemetry.update();
//        enc.steeringDrive(-24, true,true);
//        waitFor(1000);
//        telemetry.addLine("Right with toggle");
//        telemetry.update();
//        enc.steeringDrive(24, true,true);

//        enc.gyroTurn(enc.TURN_SPEED,90);
        while (opModeIsActive()) {

        }

    }
}
