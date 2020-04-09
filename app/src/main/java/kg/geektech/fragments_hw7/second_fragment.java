package kg.geektech.fragments_hw7;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 */
public class second_fragment extends Fragment  implements SecondFragment{
    TextView info;
    Button back;
    SecondFragment listener;



    public second_fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        TextView textView = new TextView(getActivity());

        textView.setText(R.string.hello_blank_fragment);

        return textView;
    }
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        info = view.findViewById(R.id.text_view_second_fragment);
        Button back = view.findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = info.getText().toString();
                int number = Integer.parseInt(text);
                listener.secondFragment(number);
            }
        });
    }

    @Override
    public void secondFragment(int number) {


    }
}

