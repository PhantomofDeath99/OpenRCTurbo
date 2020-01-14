package org.firstinspires.ftc.teamcode.Fraser.Autonomous.JordanAutonomous;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;

import com.qualcomm.robotcore.util.ElapsedTime;

import org.firstinspires.ftc.teamcode.Fraser.Subsystems.Drive.FraserComponents;
import org.firstinspires.ftc.teamcode.Fraser.Subsystems.Drive.SeansEncLibrary;
import org.firstinspires.ftc.teamcode.Fraser.Subsystems.OpenCV.GGOpenCV;
import org.firstinspires.ftc.teamcode.Fraser.Subsystems.OpenCV.GGSkystoneDetector;
import org.firstinspires.ftc.teamcode.Fraser.Subsystems.OpenCV.VisionSystem;

@Autonomous (name = "Blue Auto Vision", group = "Fraser Blue Auto")
public class Blue_Auto_Complete extends LinearOpMode {
    GGOpenCV detector;
    ElapsedTime etime = new ElapsedTime();
    private double posit = 0;

    public void waitFor(int time) {
        time = time / 1000;
        etime.reset();
        while ((etime.time() < time) && (opModeIsActive())) {
            idle();
        }
    }

    @Override
    public void runOpMode() {

        SeansEncLibrary enc = new SeansEncLibrary(hardwareMap, telemetry, this);
        enc.init();
        FraserComponents mech = new FraserComponents(hardwareMap);
        detector = new GGOpenCV(GGOpenCV.Cam.PHONE, hardwareMap);
        detector.startCamera();
        detector.startLook(VisionSystem.TargetType.SKYSTONE);

        while (!this.isStarted) {
            if (detector.found()) {
                telemetry.addData("Skystone Found!", "");
                telemetry.addData("X: ", detector.detector.foundRectangle().x);
                telemetry.addData("Y: ", detector.detector.foundRectangle().y);
                posit = detector.detector.foundRectangle().x;
                telemetry.addData("Position: ", posit);
            } else {
                telemetry.addData("Skystone not found.", "");
            }
            telemetry.update();
        }
        detector.stopLook();

        if ((posit >= 225 && posit <= 290) || (posit >= 35 && posit < 65)) {

            enc.steeringDrive(-10, false, true);
            enc.steeringDrive(44.3, false, false);
            enc.steeringDrive(4, false, false);
            waitFor(1000);
            mech.intakeStone();
            waitFor(500);
            enc.steeringDrive(-18, false, true);
            enc.steeringDrive(-33, false, false);
            waitFor(1000);
            mech.ejectStone();
        } else if ((posit >= 170 && posit <= 220) || (posit >= 1 && posit <= 30)) {

            enc.steeringDrive(-20, false, true);
            enc.steeringDrive(44.3, false, false);
            enc.steeringDrive(4, false, false);
            waitFor(1000);
            mech.intakeStone();
            waitFor(500);
            enc.steeringDrive(-18, false, true);
            enc.steeringDrive(-43, false, false);
            waitFor(1000);
            mech.ejectStone();
        } else if ((posit >= 110 && posit <= 169) || (posit == 0)) {

            enc.steeringDrive(-30, false, true);
            enc.steeringDrive(44.3, false, false);
            enc.steeringDrive(4, false, false);
            waitFor(1000);
            mech.intakeStone();
            waitFor(500);
            enc.steeringDrive(-18, false, true);
            enc.steeringDrive(-53, false, false);
            waitFor(1000);
            mech.ejectStone();
        } else {// TODO: 2020-01-14 Change this to blind grab some stones
            enc.steeringDrive(-30, false, true);
        }
    }
}