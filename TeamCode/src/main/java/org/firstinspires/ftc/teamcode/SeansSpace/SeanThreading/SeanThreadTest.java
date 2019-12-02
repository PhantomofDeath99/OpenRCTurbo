package org.firstinspires.ftc.teamcode.SeansSpace.SeanThreading;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

/**
 * Created by Sean Cardosi on 2019-11-30.
 */
@TeleOp(name = "Sean's Thread Test", group = "SeansThreading")
public class SeanThreadTest extends LinearOpMode {

    SeanThread seanThread;

    @Override
    public void runOpMode() throws InterruptedException {

        waitForStart();

        seanThread = new SeanThread();
        Thread thread = new Thread(seanThread);
        thread.start();
//        thread.run();

        while (opModeIsActive()) {
            telemetry.addData("Status" , " OpMode is Running");
            telemetry.addData("Thread", thread.isAlive());
            telemetry.update();
        }
        thread.stop();
    }
}
