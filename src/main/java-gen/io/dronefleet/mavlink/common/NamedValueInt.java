package io.dronefleet.mavlink.common;

import io.dronefleet.mavlink.annotations.MavlinkFieldInfo;
import io.dronefleet.mavlink.annotations.MavlinkMessageBuilder;
import io.dronefleet.mavlink.annotations.MavlinkMessageInfo;
import java.lang.Override;
import java.lang.String;

/**
 * Send a key-value pair as integer. The use of this message is discouraged for normal packets, but 
 * a quite efficient way for testing new messages and getting experimental debug output. 
 */
@MavlinkMessageInfo(
    id = 252,
    crc = 44
)
public final class NamedValueInt {
  /**
   * Timestamp (milliseconds since system boot) 
   */
  private final long timeBootMs;

  /**
   * Signed integer value 
   */
  private final int value;

  /**
   * Name of the debug variable 
   */
  private final String name;

  private NamedValueInt(long timeBootMs, int value, String name) {
    this.timeBootMs = timeBootMs;
    this.value = value;
    this.name = name;
  }

  @MavlinkMessageBuilder
  public static Builder builder() {
    return new Builder();
  }

  @Override
  public String toString() {
    return "NamedValueInt{timeBootMs=" + timeBootMs
         + ", name=" + name
         + ", value=" + value + "}";
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
   * Signed integer value 
   */
  @MavlinkFieldInfo(
      position = 3,
      unitSize = 4
  )
  public final int value() {
    return value;
  }

  /**
   * Name of the debug variable 
   */
  @MavlinkFieldInfo(
      position = 2,
      unitSize = 1,
      arraySize = 10
  )
  public final String name() {
    return name;
  }

  public static class Builder {
    private long timeBootMs;

    private int value;

    private String name;

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
     * Signed integer value 
     */
    @MavlinkFieldInfo(
        position = 3,
        unitSize = 4
    )
    public final Builder value(int value) {
      this.value = value;
      return this;
    }

    /**
     * Name of the debug variable 
     */
    @MavlinkFieldInfo(
        position = 2,
        unitSize = 1,
        arraySize = 10
    )
    public final Builder name(String name) {
      this.name = name;
      return this;
    }

    public final NamedValueInt build() {
      return new NamedValueInt(timeBootMs, value, name);
    }
  }
}