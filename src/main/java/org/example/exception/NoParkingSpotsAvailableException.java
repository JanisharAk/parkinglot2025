package org.example.exception;

public class NoParkingSpotsAvailableException extends Exception {
    public NoParkingSpotsAvailableException() {
        super("No parking spots left in this parking lot.");
    }
}