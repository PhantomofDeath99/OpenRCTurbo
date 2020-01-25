package org.firstinspires.ftc.teamcode.Fraser.Autonomous.JordanAutonomous;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.util.ElapsedTime;

import org.firstinspires.ftc.teamcode.Fraser.Subsystems.Drive.FraserComponents;
import org.firstinspires.ftc.teamcode.Fraser.Subsystems.Drive.SeansEncLibrary;
import org.firstinspires.ftc.teamcode.Fraser.Subsystems.OpenCV.GGOpenCV;
import org.firstinspires.ftc.teamcode.Fraser.Subsystems.OpenCV.VisionSystem;

@Autonomous (name = "Red Auto Complete " , group = "Fraser Red Auto" )
public class Red_Auto_Complete extends LinearOpMode{

    ElapsedTime etime = new ElapsedTime();
    private double posit = 0;

    public void waitFor(int time){
        time = time/1000;
        etime.reset();
        while ((etime.time() < time)&&(opModeIsActive())) {
            idle();
        }
    }

    @Override
    public void runOpMode(){

        SeansEncLibrary enc = new SeansEncLibrary(hardwareMap, telemetry, this);
        FraserComponents mech = new FraserComponents(hardwareMap);
//        GGOpenCV detector = new GGOpenCV(GGOpenCV.Cam.PHONE, hardwareMap);
//        detector.startCamera();
//        detector.startLook(VisionSystem.TargetType.SKYSTONE);

        enc.init();
        mech.init();

        waitForStart();



//        while (!this.isStarted){
//            if (detector.found()){
//                telemetry.addData("SS Found!", "");
//                telemetry.addData("X: ", detector.detector.foundRectangle().x);
//                telemetry.addData("Y: ", detector.detector.foundRectangle().y);
//
//                posit = detector.detector.foundRectangle().x;
//                telemetry.addData("Position: ", posit);
//
//            } else {
//                telemetry.addData("SS not found.", "");
//            }
//
//            telemetry.update();
//        }
//
//        detector.stopLook();

//      position 3 and 0
//        if((posit>=225&&posit<=290)||(posit>=35&&posit<65)){
//
//            mech.clawRelease();
//            enc.steeringDrive(24,false,false);
//            enc.arcTurn(93);
//            enc.steeringDrive(-3,false,false);
//            mech.autoIntake();
//            enc.steeringDrive(19, false, true);
//            enc.steeringDrive(7,false,false);
//            waitFor(500);
//            mech.clawGrab();
//            mech.stopStone();
//            enc.steeringDrive(-17.7,false,true);
//            enc.steeringDrive(-80,false,false);
//            enc.arcTurn(90);
//            enc.steeringDrive(-5,false,true);
//            enc.steeringDrive(-7,false,false);
//            waitFor(500);
//            mech.shoulderUp();
//            waitFor(1500);
//            mech.clawRelease();
//            waitFor(500);
//            mech.shoulderDown();
//            mech.foundationRelease();
//            waitFor(1500);
//            enc.steeringDrive(28,false,false);
//            enc.arcTurn(-90);
//            mech.foundationGrab();
//            enc.arcTurn(45);
//            enc.steeringDrive(40,false,true);









//
//
//
//        }

        //     position 1 and 4
//        if ((posit>=170&&posit<=220)||(posit>=1&&posit<=30)){

//        mech.clawRelease();
//        enc.steeringDrive(6,false,false);
//        enc.steeringDrive(21,false,true);
//        enc.arcTurn(90);
//        mech.autoIntake();
//        enc.steeringDrive( 40, false, true);
//        enc.steeringDrive(4.5, false, false);
//        waitFor(500);
//        mech.clawGrab();
//        mech.stopStone();
//        enc.steeringDrive(-17,false,true);
//        enc.steeringDrive(-70,false,false);
//        enc.arcTurn(90);
//        enc.steeringDrive(-5,false,true);
//        enc.steeringDrive(-7,false,false);
//        waitFor(500);
//        mech.shoulderUp();
//        waitFor(1500);
//        mech.clawRelease();
//        waitFor(500);
//        mech.shoulderDown();
//        mech.foundationRelease();
//        waitFor(1500);
//        enc.steeringDrive(28,false,false);
//        enc.arcTurn(-90);
//        mech.foundationGrab();
//        enc.arcTurn(45);
//        enc.steeringDrive(40,false,true);




//        }
//         position 2 and 5
//        if ((posit>=110&&posit<=169)||(posit==0)){

            mech.clawRelease();
            enc.steeringDrive(6,false, false);
            enc.steeringDrive(13.5, false,true);
            enc.arcTurn(90);
            mech.autoIntake();
            enc.steeringDrive(39.5,false,true);
            enc.steeringDrive(6.5,false,false);
            waitFor(500);
            mech.clawGrab();
            mech.stopStone();
            enc.steeringDrive(-20,false,true);
            enc.steeringDrive(-75,false,false);
            enc.arcTurn(90);
            enc.steeringDrive(-5,false,true);
            enc.steeringDrive(-7,false,false);
            waitFor(500);
            mech.shoulderUp();
            waitFor(1500);
            mech.clawRelease();
            waitFor(500);
            mech.shoulderDown();
            mech.foundationRelease();
            waitFor(1500);
            enc.steeringDrive(28,false,false);
            enc.arcTurn(-90);
            mech.foundationGrab();
            enc.arcTurn(45);
            enc.steeringDrive(40,false,true);



//
//        }


    }



}
