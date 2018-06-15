package com.azhen.designpattern.construct.builder.example1;

public class AlarmPushQuery {
    private String pushType;
    private String flowcode;
    private String messageId;
    private String messageCode;
    private String messageIdx;

    public AlarmPushQuery(String pushType, String flowcode, String messageId, String messageCode, String messageIdx) {
        this.pushType = pushType;
        this.flowcode = flowcode;
        this.messageId = messageId;
        this.messageCode = messageCode;
        this.messageIdx = messageIdx;
    }

    public static Builder newQuery(String flowcode) {
        return new Builder(flowcode);
    }

    public static class Builder {
        private String pushType;
        private String flowcode;
        private String messageId;
        private String messageCode;
        private String messageIdx;

        public Builder(String flowcode) {
            this.flowcode = flowcode;
        }

        public AlarmPushQuery build() {
            return new AlarmPushQuery(pushType, flowcode, messageId, messageCode, messageIdx);
        }

        public Builder pushType(String pushType) {
            this.pushType = pushType;
            return this;
        }

        public Builder messageId(String messageId) {
            this.messageId = messageId;
            return this;
        }

        public Builder messageCode(String messageCode) {
            this.messageCode = messageCode;
            return this;
        }
        public Builder messageIdx(String messageIdx) {
            this.messageIdx = messageIdx;
            return this;
        }
    }

    public String getPushType() {
        return pushType;
    }

    public void setPushType(String pushType) {
        this.pushType = pushType;
    }

    public String getFlowcode() {
        return flowcode;
    }

    public void setFlowcode(String flowcode) {
        this.flowcode = flowcode;
    }

    public String getMessageId() {
        return messageId;
    }

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    public String getMessageCode() {
        return messageCode;
    }

    public void setMessageCode(String messageCode) {
        this.messageCode = messageCode;
    }

    public String getMessageIdx() {
        return messageIdx;
    }

    public void setMessageIdx(String messageIdx) {
        this.messageIdx = messageIdx;
    }
}
