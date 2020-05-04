package com.feeyo.net.codec.mqtt;

/**
 * Contains a topic name and Qos Level.
 * This is part of the {@link MqttSubscribePayload}
 */
public final class MqttTopicSubscription {

    private final String topicFilter;
    private final MqttQoS qualityOfService;

    public MqttTopicSubscription(String topicFilter, MqttQoS qualityOfService) {
        this.topicFilter = topicFilter;
        this.qualityOfService = qualityOfService;
    }

    public String topicName() {
        return topicFilter;
    }

    public MqttQoS qualityOfService() {
        return qualityOfService;
    }

    @Override
    public String toString() {
        return new StringBuilder()
            .append('[')
            .append("topicFilter=").append(topicFilter)
            .append(", qualityOfService=").append(qualityOfService)
            .append(']')
            .toString();
    }
}
