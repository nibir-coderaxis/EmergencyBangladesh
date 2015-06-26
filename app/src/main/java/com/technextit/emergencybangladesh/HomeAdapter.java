package com.technextit.emergencybangladesh;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.technextit.emergencybangladesh.data.model.ServiceItem;

import java.util.ArrayList;

/**
 * Created by DELL on 6/26/2015.
 */
public class HomeAdapter extends BaseAdapter {

    Context context;
    private ArrayList<ServiceItem> serviceItems;

    public HomeAdapter(Context context, ArrayList<ServiceItem> serviceItems){
        this.context = context;
        this.serviceItems = serviceItems;
    }

    @Override
    public int getCount() {
        return serviceItems.size();
    }

    @Override
    public Object getItem(int position) {
        return serviceItems.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {

        ViewHolder viewHolder = null;

        if (convertView == null) {
            viewHolder = new ViewHolder();
            convertView = LayoutInflater.from(context).inflate(R.layout.service_list_item,parent,false);
            viewHolder.icon = (ImageView) convertView.findViewById(R.id.serviceIcon);
            viewHolder.titleText = (TextView) convertView.findViewById(R.id.serviceTitle);
            viewHolder.descriptionText = (TextView) convertView.findViewById(R.id.serviceDescription);
            viewHolder.serviceButton = (Button) convertView.findViewById(R.id.selectService);

            convertView.setTag(viewHolder);

        }else{
            viewHolder = (ViewHolder) convertView.getTag();
        }


        ServiceItem serviceItem = (ServiceItem) getItem(position);

        viewHolder.titleText.setText(serviceItem.getServiceTitle());
        viewHolder.descriptionText.setText(serviceItem.getServiceDescription());
        viewHolder.icon.setImageResource(serviceItem.getServiceIcon());
        viewHolder.serviceButton.setOnClickListener( new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Toast.makeText(context, "Service " + position + " selected", Toast.LENGTH_SHORT).show();
             //   Intent intent = new Intent(this,);
               // context.startActivity(intent);
            }
        });
        return convertView;

    }

    private class ViewHolder{
        public ImageView icon;
        public TextView titleText;
        public TextView descriptionText;
        public Button serviceButton;
    }
}
