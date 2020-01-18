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
            enc.steeringDrive(24,false,false);
            enc.arcTurn(93);
            enc.steeringDrive(-2,false,false);
            mech.intakeStone();
            enc.steeringDrive(19, false, true);
            enc.steeringDrive(6,false,false);
            mech.stopStone();
            enc.steeringDrive(-15.7,false,true);
            enc.steeringDrive(-60,false,false);
            enc.arcTurn(180);
            mech.ejectStone();
            enc.steeringDrive(-15,false,false);
            mech.stopStone();

//
//
//
//        }

        //     position 1 and 4
//        if ((posit>=170&&posit<=220)||(posit>=1&&posit<=30)){

//        enc.steeringDrive(6,false,false);
//        enc.steeringDrive(21,false,true);
//        enc.arcTurn(90);
//        mech.intakeStone();
//        enc.steeringDrive( 40, false, true);
//        enc.steeringDrive(4.5, false, false);
//        enc.steeringDrive(-17,false,true);
//        mech.stopStone();
//        enc.steeringDrive(-45,false,false);
//        enc.arcTurn(270);
//        mech.ejectStone();
//        waitFor(500);
//        enc.arcTurn(90);
//        mech.stopStone();
//        enc.steeringDrive(62,false,false);
//        enc.steeringDrive(18.7,false, true);
//        mech.intakeStone();
//        enc.steeringDrive(6, false, false);
//        mech.stopStone();
//        enc.steeringDrive(-18,false, true);
//        enc.steeringDrive(-63,false,false);
//        enc.arcTurn(180);
//        mech.ejectStone();
//        enc.steeringDrive(-10,false,false);
//



//        }
//         position 2 and 5
//        if ((posit>=110&&posit<=169)||(posit==0)){


//            enc.steeringDrive(6,false, false);
//            enc.steeringDrive(13.5, false,true);
//            enc.arcTurn(90);
//            mech.intakeStone();
//            enc.steeringDrive(40,false,true);
//            enc.steeringDrive(4.5,false,false);
//            enc.steeringDrive(-17,false,true);
//            mech.stopStone();
//            enc.steeringDrive(-50,false,false);
//            enc.arcTurn(270);
//            mech.ejectStone();
//            waitFor(500);
//            enc.arcTurn(90);
//            mech.stopStone();
//            enc.steeringDrive(69,false,false);
//            enc.steeringDrive(20,false, true);
//            mech.intakeStone();
//            enc.steeringDrive(6, false, false);
//            mech.stopStone();
//            enc.steeringDrive(-18,false, true);
//            enc.steeringDrive(-68,false,false);
//            enc.arcTurn(180);
//            mech.ejectStone();
//            enc.steeringDrive(-10,false,false);

//
//        }


    }



}
