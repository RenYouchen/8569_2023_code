package frc.robot.subsystems;

import edu.wpi.first.math.util.Units;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;
import org.photonvision.PhotonCamera;
import org.photonvision.PhotonUtils;
import org.photonvision.common.hardware.VisionLEDMode;
import org.photonvision.targeting.PhotonPipelineResult;
import org.photonvision.targeting.PhotonTrackedTarget;

import java.util.List;

public class Camera extends SubsystemBase {
    private static PhotonCamera camera = new PhotonCamera("Camera");
    public Camera() {
        PhotonPipelineResult result = camera.getLatestResult();
        List<PhotonTrackedTarget> allTarget = null;
        PhotonTrackedTarget bestTarget = null;
        if (result.hasTargets()) {
            allTarget = result.getTargets();
            bestTarget = result.getBestTarget();
        }
        debug(bestTarget);
    }
    public static void debug(PhotonTrackedTarget target) {
        SmartDashboard.putNumber("ID",target.getFiducialId());
        SmartDashboard.putNumber("YAW", target.getYaw());
        SmartDashboard.putNumber("PITCH", target.getPitch());
        SmartDashboard.putNumber("AREA", target.getArea());
        SmartDashboard.putNumber("SKEW", target.getSkew());
    }
    public static void led(PhotonCamera cam) {
        cam.setLED(VisionLEDMode.kDefault);
    }
    public static void getRange(PhotonTrackedTarget target) {
        double tR = PhotonUtils.calculateDistanceToTargetMeters(
                Constants.CAMERA_HEIGHT_METERS,
                Constants.TARGET_HEIGHT_METERS,
                Constants.CAMERA_PITCH_RADIANS,
                Units.degreesToRadians(target.getPitch())
        );

        SmartDashboard.putNumber("targetRange",tR);
    }
}
