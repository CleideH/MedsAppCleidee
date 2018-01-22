package br.ufop.cleide;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class MedicineAdapter extends BaseAdapter{

    private Context context;
    private List<Medicines> list;

    @Override
    public int getCount() {
        return 0;
    }

    public MedicineAdapter(Context context, List<Medicines> list){
        this.context = context;
        this.list = list;
    }

    @Override
    public Object getItem(int position) {
        Medicines medicine = list.get(position);
        return medicine;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        Medicines medicine =  list.get(position);

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View v = inflater.inflate(R.layout.activity_medicine_detail,null);

        TextView tvName = v.findViewById(R.id.nameMed);
        tvName.setText(""+medicine.getName());
        TextView tvDosage = v.findViewById(R.id.dosage);
        tvDosage.setText(""+medicine.getDosage());
        TextView tvDuration = v.findViewById(R.id.duration);
        tvDuration.setText(""+medicine.getDuration());
        TextView tvIndication = v.findViewById(R.id.indications);
        tvIndication.setText(""+medicine.getIndications());



        return null;
    }
}
