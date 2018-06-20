package io.dronefleet.mavlink.common;

import io.dronefleet.mavlink.annotations.MavlinkFieldInfo;
import io.dronefleet.mavlink.annotations.MavlinkMessageBuilder;
import io.dronefleet.mavlink.annotations.MavlinkMessageInfo;
import java.lang.Override;
import java.lang.String;

/**
 * Request the information of the mission item with the sequence number seq. The response of the 
 * system to this message should be a MISSION_ITEM_INT message. 
 * https://mavlink.io/en/protocol/mission.html 
 */
@MavlinkMessageInfo(
    id = 51,
    crc = 196
)
public final class MissionRequestInt {
  /**
   * Sequence 
   */
  private final int seq;

  /**
   * System ID 
   */
  private final int targetSystem;

  /**
   * Component ID 
   */
  private final int targetComponent;

  /**
   * Mission type, see {@link io.dronefleet.mavlink.common.MavMissionType MavMissionType} 
   */
  private final MavMissionType missionType;

  private MissionRequestInt(int seq, int targetSystem, int targetComponent,
      MavMissionType missionType) {
    this.seq = seq;
    this.targetSystem = targetSystem;
    this.targetComponent = targetComponent;
    this.missionType = missionType;
  }

  @MavlinkMessageBuilder
  public static Builder builder() {
    return new Builder();
  }

  @Override
  public String toString() {
    return "MissionRequestInt{targetSystem=" + targetSystem
         + ", targetComponent=" + targetComponent
         + ", seq=" + seq
         + ", missionType=" + missionType + "}";
  }

  /**
   * Sequence 
   */
  @MavlinkFieldInfo(
      position = 3,
      unitSize = 2
  )
  public final int seq() {
    return seq;
  }

  /**
   * System ID 
   */
  @MavlinkFieldInfo(
      position = 1,
      unitSize = 1
  )
  public final int targetSystem() {
    return targetSystem;
  }

  /**
   * Component ID 
   */
  @MavlinkFieldInfo(
      position = 2,
      unitSize = 1
  )
  public final int targetComponent() {
    return targetComponent;
  }

  /**
   * Mission type, see {@link io.dronefleet.mavlink.common.MavMissionType MavMissionType} 
   */
  @MavlinkFieldInfo(
      position = 5,
      unitSize = 1,
      extension = true
  )
  public final MavMissionType missionType() {
    return missionType;
  }

  public static class Builder {
    private int seq;

    private int targetSystem;

    private int targetComponent;

    private MavMissionType missionType;

    private Builder() {
    }

    /**
     * Sequence 
     */
    @MavlinkFieldInfo(
        position = 3,
        unitSize = 2
    )
    public final Builder seq(int seq) {
      this.seq = seq;
      return this;
    }

    /**
     * System ID 
     */
    @MavlinkFieldInfo(
        position = 1,
        unitSize = 1
    )
    public final Builder targetSystem(int targetSystem) {
      this.targetSystem = targetSystem;
      return this;
    }

    /**
     * Component ID 
     */
    @MavlinkFieldInfo(
        position = 2,
        unitSize = 1
    )
    public final Builder targetComponent(int targetComponent) {
      this.targetComponent = targetComponent;
      return this;
    }

    /**
     * Mission type, see {@link io.dronefleet.mavlink.common.MavMissionType MavMissionType} 
     */
    @MavlinkFieldInfo(
        position = 5,
        unitSize = 1,
        extension = true
    )
    public final Builder missionType(MavMissionType missionType) {
      this.missionType = missionType;
      return this;
    }

    public final MissionRequestInt build() {
      return new MissionRequestInt(seq, targetSystem, targetComponent, missionType);
    }
  }
}