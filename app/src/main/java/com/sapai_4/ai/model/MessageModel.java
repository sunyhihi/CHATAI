package com.sapai_4.ai.model;

public class MessageModel {
    public static String SENT_BY_ME = "me";
    public static String SENT_BY_BOT="bot";

    String message;
    String sentBy;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getSentBy() {
        return sentBy;
    }

    public void setSentBy(String sentBy) {
        this.sentBy = sentBy;
    }

    public MessageModel(String message, String sentBy) {
        this.message = message;
        this.sentBy = sentBy;
    }
}
