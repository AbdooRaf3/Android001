package com.itcat;

public class Human {
    boolean hasEnvelope;

    void takeEnvelope(long envelopeId, String destination){
        if (hasEnvelope == false) {
            System.out.println("Taking envelope : " + envelopeId + "to destination :" + destination);
            hasEnvelope = true;
        }else {
            System.out.println("I cant take this envelope");
        }
    }
    void deliveredEnvelop (String receivedPerson,long envelopeId){
        if(hasEnvelope == true) {
            System.out.println("Mr: " + receivedPerson + "has received the " + envelopeId + "envelope");
            hasEnvelope = false;
        }else {
            System.out.println("I dont have envelope ");
        }
    }
}
