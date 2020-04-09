package kg.geektech.fragments_hw7;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements IInputFragment {

    MainFragment mainFragment;
    InputFragment inputFragment;
    TextView textView;
    RecyclerView recyclerView;
    public ArrayList<String> data = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FragmentManager fragmentManager = getSupportFragmentManager();
        mainFragment = (MainFragment) fragmentManager.findFragmentById(R.id.recycler_fragment);
        inputFragment = (InputFragment) fragmentManager.findFragmentById(R.id.input_fragment);
        inputFragment.listener = this;




    }

    @Override
    public void onInputNumber(int number) {
            mainFragment.fullList(number);

    }

    @Override
    public void pressOnRecyclerList(int number) {

        data.get(number);

        Intent toSecActivity=new Intent(this, SecondActivity.class );
        startActivity(toSecActivity);


    }
}



