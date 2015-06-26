package com.technextit.emergencybangladesh.data;

import com.technextit.emergencybangladesh.R;
import com.technextit.emergencybangladesh.data.model.ServiceItem;

import java.util.ArrayList;

/**
 * Created by DELL on 6/26/2015.
 */
public class DataUtils {

    static ArrayList<ServiceItem> serviceItems = new ArrayList<ServiceItem>();

    static {
        serviceItems.add(new ServiceItem("Ambulance", "", R.drawable.ambulance_service_icon));
        serviceItems.add(new ServiceItem("Police Station", "", R.drawable.police_service_icon));
        serviceItems.add(new ServiceItem("Fire Brigade", "", R.drawable.fire_service_icon));
    }


    public static ArrayList serviceList(){
        return serviceItems;

    }
}
