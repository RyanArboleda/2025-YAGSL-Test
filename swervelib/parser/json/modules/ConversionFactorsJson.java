package frc.robot.swervelib.parser.json.modules;

/**
 * Conversion Factors parsed JSON class
 */
public class ConversionFactorsJson
{

  /**
   * Drive motor conversion factors composition.
   */
  public DriveConversionFactorsJson drive = new DriveConversionFactorsJson();
  /**
   * Angle motor conversion factors composition.
   */
  public AngleConversionFactorsJson angle = new AngleConversionFactorsJson();

  /**
   * Check if the conversion factors are set for the drive motor.
   *
   * @return Empty
   */
  public boolean isDriveEmpty()
  {
    return drive.factor == 0 && drive.diameter == 0 && drive.gearRatio == 0;
  }

  /**
   * Check if the conversion factors are set for the angle motor.
   *
   * @return Empty
   */
  public boolean isAngleEmpty()
  {
    return angle.factor == 0 && angle.gearRatio == 0;
  }
}
