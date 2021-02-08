package sss.com.fragments.ui.fragments.sunday;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import sss.com.fragments.R;
import sss.com.fragments.ui.base.BaseFragment;


public class SundayFragment extends BaseFragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_sunday,container,false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }

    @Override
    public void onViewCreated(@NonNull View view, EditText editText, @Nullable Bundle savedInstanceState) {

    }

    @Override
    public String getTitle() {
        return "Sun";
    }
}