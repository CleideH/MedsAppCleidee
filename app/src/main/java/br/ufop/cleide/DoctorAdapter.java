package br.ufop.cleide;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class DoctorAdapter extends BaseAdapter {

    private Context context;
    private List<Doctor> list;

    public DoctorAdapter(Context context, List<Doctor> list){
        this.context = context;
        this.list = list;

    }

    public DoctorAdapter(){

    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        Doctor doctor = list.get(position);
        return doctor;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        Doctor doctor = list.get(position);

        LayoutInflater inflater = (LayoutInflater) context.getSystemService( Context.LAYOUT_INFLATER_SERVICE);

        View v = inflater.inflate(R.layout.activity_doctor_detail,null);

        TextView textName = v.findViewById(R.id.textView);
        textName.setText(doctor.getName());
        TextView textSpecialty = v.findViewById(R.id.textView2);
        textSpecialty.setText(doctor.getSpecialty());

        return v;

    }
}

