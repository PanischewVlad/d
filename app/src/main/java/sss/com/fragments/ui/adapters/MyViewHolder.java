package sss.com.fragments.ui.adapters;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import sss.com.fragments.R;
import sss.com.fragments.models.RecipeModel;

class MyVievHolder extends RecyclerView.ViewHolder {
    private TextView txtTitle;
    private TextView txtDescription;
    private Button deletItem;

    public MyVievHolder(@NonNull View itemView) {
        super(itemView);
        txtTitle = itemView.findViewById(R.id.txtTitle);
        txtDescription = itemView.findViewById(R.id.txtDescription);
        deletItem = itemView.findViewById(R.id.btnDellete);
    }

    public void onBind(RecipeModel recipeModel, MyRVAdapter.OnItemClick listener){
        txtTitle.setText(recipeModel.getTitle());
        txtDescription.setText(recipeModel.getDescription());
        deletItem.setOnClickListener(v->listener.onClick(recipeModel));
    }
}
