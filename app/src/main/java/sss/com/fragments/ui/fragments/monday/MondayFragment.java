package sss.com.fragments.ui.fragments.monday;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.List;

import sss.com.fragments.R;
import sss.com.fragments.ui.adapters.MyRVAdapter;
import sss.com.fragments.models.RecipeModel;
import sss.com.fragments.ui.base.BaseFragment;


public class MondayFragment extends BaseFragment {

    private RecyclerView rvList;
    private MyRVAdapter adapter;

    private Button btnAdd, btnDel;

    private EditText etTitle, etDescription;

    private  String etTitleStr, etDescriptionStr;

    private  ArrayList<RecipeModel> list;


    private  MyRVAdapter.OnItemClick listener = new MyRVAdapter.OnItemClick() {
        @Override
        public void onClick(RecipeModel model) {
            delete(model);
        }
    };
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_monday,container,false);


    }

    @Override
    public void onViewCreated(@NonNull View view, EditText editText, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        rvList = view.findViewById(R.id.rvList);

        btnAdd = view.findViewById(R.id.btnAdd);
        btnDel = view.findViewById(R.id.btnDel);

        etTitle = view.findViewById(R.id.etTitle);
        etDescription = view.findViewById(R.id.etDescription);

        etTitleStr = etTitle.getText().toString();
        etDescriptionStr = etDescription.getText().toString();

        btnAdd.setOnClickListener(v -> add());

        btnDel.setOnClickListener(v -> del());

        list = (ArrayList<RecipeModel>) generateRecipes();
        adapter = new MyRVAdapter(list, listener);

        rvList.setLayoutManager(new LinearLayoutManager(getContext()));
        rvList.setAdapter(adapter);
        adapter.notifyDataSetChanged();
    }

    private  void delete (RecipeModel model){
       adapter.notifyItemRemoved(list.indexOf(model));
       list.remove(model);
    }

    private List<RecipeModel> generateRecipes() {
        ArrayList<RecipeModel> tmp = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            tmp.add(new RecipeModel(""+etTitleStr,""+ etDescriptionStr));
        }
        return tmp;
    }

    @Override
    public String getTitle() {
        return null;
    }

    private void   add()
    {
adapter.notifyItemRemoved(0);

list.add(new RecipeModel(""+ etTitleStr ,""+ etDescriptionStr));
    }
    private void   del()
    {
    adapter.notifyItemRemoved(list.size()-1);
list.remove(list.size()-1);

    }


}
