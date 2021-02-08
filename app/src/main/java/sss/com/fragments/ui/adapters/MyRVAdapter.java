package sss.com.fragments.ui.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import sss.com.fragments.R;
import sss.com.fragments.models.RecipeModel;

public class MyRVAdapter extends RecyclerView.Adapter<MyVievHolder> {

    private List<RecipeModel> recipeModels;
    private OnItemClick listener;

    public MyRVAdapter(List<RecipeModel> recipeModels, OnItemClick listener) {
        this.recipeModels = recipeModels;
        this.listener = listener;

    }

    @NonNull
    @Override
    public MyVievHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyVievHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.contaner,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyVievHolder holder, int position) {
        holder.onBind(recipeModels.get(position), listener);
    }

    @Override
    public int getItemCount() {
        return recipeModels.size();
    }

    public interface OnItemClick{
        public  void onClick(RecipeModel model);
    }
}
