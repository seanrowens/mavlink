package io.dronefleet.mavlink.matrixpilot;

import io.dronefleet.mavlink.annotations.MavlinkFieldInfo;
import io.dronefleet.mavlink.annotations.MavlinkMessageBuilder;
import io.dronefleet.mavlink.annotations.MavlinkMessageInfo;
import java.lang.Override;
import java.lang.String;

/**
 * The altitude measured by sensors and IMU 
 */
@MavlinkMessageInfo(
    id = 181,
    crc = 55
)
public final class Altitudes {
  /**
   * Timestamp (milliseconds since system boot) 
   */
  private final long timeBootMs;

  /**
   * GPS altitude in meters, expressed as * 1000 (millimeters), above MSL 
   */
  private final int altGps;

  /**
   * IMU altitude above ground in meters, expressed as * 1000 (millimeters) 
   */
  private final int altImu;

  /**
   * barometeric altitude above ground in meters, expressed as * 1000 (millimeters) 
   */
  private final int altBarometric;

  /**
   * Optical flow altitude above ground in meters, expressed as * 1000 (millimeters) 
   */
  private final int altOpticalFlow;

  /**
   * Rangefinder Altitude above ground in meters, expressed as * 1000 (millimeters) 
   */
  private final int altRangeFinder;

  /**
   * Extra altitude above ground in meters, expressed as * 1000 (millimeters) 
   */
  private final int altExtra;

  private Altitudes(long timeBootMs, int altGps, int altImu, int altBarometric, int altOpticalFlow,
      int altRangeFinder, int altExtra) {
    this.timeBootMs = timeBootMs;
    this.altGps = altGps;
    this.altImu = altImu;
    this.altBarometric = altBarometric;
    this.altOpticalFlow = altOpticalFlow;
    this.altRangeFinder = altRangeFinder;
    this.altExtra = altExtra;
  }

  @MavlinkMessageBuilder
  public static Builder builder() {
    return new Builder();
  }

  @Override
  public String toString() {
    return "Altitudes{timeBootMs=" + timeBootMs
         + ", altGps=" + altGps
         + ", altImu=" + altImu
         + ", altBarometric=" + altBarometric
         + ", altOpticalFlow=" + altOpticalFlow
         + ", altRangeFinder=" + altRangeFinder
         + ", altExtra=" + altExtra + "}";
  }

  /**
   * Timestamp (milliseconds since system boot) 
   */
  @MavlinkFieldInfo(
      position = 1,
      unitSize = 4
  )
  public final long timeBootMs() {
    return timeBootMs;
  }

  /**
   * GPS altitude in meters, expressed as * 1000 (millimeters), above MSL 
   */
  @MavlinkFieldInfo(
      position = 2,
      unitSize = 4
  )
  public final int altGps() {
    return altGps;
  }

  /**
   * IMU altitude above ground in meters, expressed as * 1000 (millimeters) 
   */
  @MavlinkFieldInfo(
      position = 3,
      unitSize = 4
  )
  public final int altImu() {
    return altImu;
  }

  /**
   * barometeric altitude above ground in meters, expressed as * 1000 (millimeters) 
   */
  @MavlinkFieldInfo(
      position = 4,
      unitSize = 4
  )
  public final int altBarometric() {
    return altBarometric;
  }

  /**
   * Optical flow altitude above ground in meters, expressed as * 1000 (millimeters) 
   */
  @MavlinkFieldInfo(
      position = 5,
      unitSize = 4
  )
  public final int altOpticalFlow() {
    return altOpticalFlow;
  }

  /**
   * Rangefinder Altitude above ground in meters, expressed as * 1000 (millimeters) 
   */
  @MavlinkFieldInfo(
      position = 6,
      unitSize = 4
  )
  public final int altRangeFinder() {
    return altRangeFinder;
  }

  /**
   * Extra altitude above ground in meters, expressed as * 1000 (millimeters) 
   */
  @MavlinkFieldInfo(
      position = 7,
      unitSize = 4
  )
  public final int altExtra() {
    return altExtra;
  }

  public static class Builder {
    private long timeBootMs;

    private int altGps;

    private int altImu;

    private int altBarometric;

    private int altOpticalFlow;

    private int altRangeFinder;

    private int altExtra;

    private Builder() {
    }

    /**
     * Timestamp (milliseconds since system boot) 
     */
    @MavlinkFieldInfo(
        position = 1,
        unitSize = 4
    )
    public final Builder timeBootMs(long timeBootMs) {
      this.timeBootMs = timeBootMs;
      return this;
    }

    /**
     * GPS altitude in meters, expressed as * 1000 (millimeters), above MSL 
     */
    @MavlinkFieldInfo(
        position = 2,
        unitSize = 4
    )
    public final Builder altGps(int altGps) {
      this.altGps = altGps;
      return this;
    }

    /**
     * IMU altitude above ground in meters, expressed as * 1000 (millimeters) 
     */
    @MavlinkFieldInfo(
        position = 3,
        unitSize = 4
    )
    public final Builder altImu(int altImu) {
      this.altImu = altImu;
      return this;
    }

    /**
     * barometeric altitude above ground in meters, expressed as * 1000 (millimeters) 
     */
    @MavlinkFieldInfo(
        position = 4,
        unitSize = 4
    )
    public final Builder altBarometric(int altBarometric) {
      this.altBarometric = altBarometric;
      return this;
    }

    /**
     * Optical flow altitude above ground in meters, expressed as * 1000 (millimeters) 
     */
    @MavlinkFieldInfo(
        position = 5,
        unitSize = 4
    )
    public final Builder altOpticalFlow(int altOpticalFlow) {
      this.altOpticalFlow = altOpticalFlow;
      return this;
    }

    /**
     * Rangefinder Altitude above ground in meters, expressed as * 1000 (millimeters) 
     */
    @MavlinkFieldInfo(
        position = 6,
        unitSize = 4
    )
    public final Builder altRangeFinder(int altRangeFinder) {
      this.altRangeFinder = altRangeFinder;
      return this;
    }

    /**
     * Extra altitude above ground in meters, expressed as * 1000 (millimeters) 
     */
    @MavlinkFieldInfo(
        position = 7,
        unitSize = 4
    )
    public final Builder altExtra(int altExtra) {
      this.altExtra = altExtra;
      return this;
    }

    public final Altitudes build() {
      return new Altitudes(timeBootMs, altGps, altImu, altBarometric, altOpticalFlow, altRangeFinder, altExtra);
    }
  }
}