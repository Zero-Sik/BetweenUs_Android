package org.techtown.betweenus_android.widget.recyclerview.viewholder;

import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

import org.techtown.betweenus_android.databinding.StudyItemBinding;

public class MainListViewHolder extends RecyclerView.ViewHolder {
    public StudyItemBinding binding;

    public MainListViewHolder(@NonNull View itemView) {
        super(itemView);
        binding = DataBindingUtil.bind(itemView);

        binding.studyTime.setSelected(true);
    }
}
