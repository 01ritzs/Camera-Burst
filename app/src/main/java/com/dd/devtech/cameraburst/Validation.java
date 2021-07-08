package com.dd.devtech.cameraburst;

public class Validation {
    public boolean isValidEmailId(String emailId) {
        if(emailId!= null && emailId.contains("@")){
            return true;
        }
        return false;
    }
}
