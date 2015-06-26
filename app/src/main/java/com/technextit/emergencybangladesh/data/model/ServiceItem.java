package com.technextit.emergencybangladesh.data.model;

/**
 * Created by DELL on 6/26/2015.
 */
public class ServiceItem {
    String serviceTitle;
    String serviceDescription;
    int serviceIcon;

    public ServiceItem(String serviceTitle, String serviceDescription,int serviceIcon){
        this.serviceTitle = serviceTitle;
        this.serviceDescription = serviceDescription;
        this.serviceIcon = serviceIcon;
    }

    public String getServiceTitle() {
        return serviceTitle;
    }

    public void setServiceTitle(String serviceTitle) {
        this.serviceTitle = serviceTitle;
    }

    public String getServiceDescription() {
        return serviceDescription;
    }

    public void setServiceDescription(String serviceDescription) {
        this.serviceDescription = serviceDescription;
    }

    public int getServiceIcon() {
        return serviceIcon;
    }

    public void setServiceIcon(int serviceIcon) {
        this.serviceIcon = serviceIcon;
    }
}
