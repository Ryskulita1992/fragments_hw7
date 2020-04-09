package kg.geektech.fragments_hw7;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.widget.TextView;

import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.List;

public class SecondActivity<Second> extends AppCompatActivity implements SecondFragment {
    TextView info;
    SecondFragment listener;
     Second secondFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        FragmentManager manager = getSupportFragmentManager();
        secondFragment = (Second) manager.findFragmentById(R.id.recycler_fragment);

        manager.findFragmentById(R.id.text_view_second_fragment);
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        //SecondFragment secondFragment = SecondFragment.newInstance(1, "Element");
//        ft.replace(R.id.second_fragment, catFragment);
//        ft.commit();


    }

    @Override
    public void secondFragment(int number) {

    }
}
