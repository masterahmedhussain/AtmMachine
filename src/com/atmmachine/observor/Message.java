package com.atmmachine.observor;

public class Message 
{
    final int messageContent;
     
    public Message (int m) {
        this.messageContent = m;
    }
 
    public int getMessageContent() {
        return messageContent;
    }
}