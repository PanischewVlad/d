package sss.com.fragments.ui.base;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public abstract class BaseFragment extends Fragment {
    public abstract void onViewCreated(@NonNull View view, EditText editText, @Nullable Bundle savedInstanceState);

    public abstract String getTitle();
}
