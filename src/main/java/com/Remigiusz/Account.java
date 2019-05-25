package com.Remigiusz;




public class Account {


    private boolean active;
    private Address defaultDeliveryAddress;
    private String mail;

    public Account(Address defaultDeliveryAddress) {
        this.defaultDeliveryAddress = defaultDeliveryAddress;
        if(defaultDeliveryAddress != null) {
            setActive(true);
        }else {
            this.active = false;
        }
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        if(mail.matches("test@test.com"))
        this.mail = mail;
        else throw new IllegalArgumentException("Bad format");
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public Account() {
        this.active = false;
    }

    public Address getDefaultDeliveryAddress() {
        return defaultDeliveryAddress;
    }

    public void setDefaultDeliveryAddress(Address defaultDeliveryAddress) {
        this.defaultDeliveryAddress = defaultDeliveryAddress;
    }
}
