package com.example.gumaps.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.gumaps.R;
import com.example.gumaps.model.Faculty;

import java.util.List;

public class FacultyAdapter extends RecyclerView.Adapter<FacultyAdapter.FacultyViewHolder> {

    List<Faculty> facultyList;

    public FacultyAdapter(List<Faculty> facultyList) {
        this.facultyList = facultyList;
    }

    @NonNull
    @Override
    public FacultyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.faculty_list_item, parent, false);
        return new FacultyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull FacultyViewHolder holder, int position) {
        Faculty currentFaculty = facultyList.get(position);
        holder.name.setText(currentFaculty.getName());
        holder.subjectCode.setText(currentFaculty.getSubjectCode());
        holder.room.setText(currentFaculty.getRoom());
    }

    @Override
    public int getItemCount() {
        return facultyList.size();
    }

    public void add(Faculty faculty){
        facultyList.add(faculty);
        notifyDataSetChanged();
    }

    public class FacultyViewHolder extends RecyclerView.ViewHolder{

        private TextView name;
        private TextView subjectCode;
        private TextView room;

        public FacultyViewHolder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.faculty_list_item_name);
            subjectCode = itemView.findViewById(R.id.faculty_list_item_subjectCode);
            room = itemView.findViewById(R.id.faculty_list_item_room);
        }
    }

}
