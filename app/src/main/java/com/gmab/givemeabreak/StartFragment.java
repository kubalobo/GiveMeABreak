package com.gmab.givemeabreak;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.Toast;

import java.util.List;

/**
 * Created by Kuba on 09.04.2017.
 *
 * Fragment with mainScreen.
 */

public class StartFragment extends Fragment{

    @Override public void onCreate(Bundle savedInstanceState) { super.onCreate(savedInstanceState);
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.start_screen, container, false);

        ImageButton gmabButton = (ImageButton) v.findViewById(R.id.gmabButton);
        gmabButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Context context = getActivity();

                List<String> quotes = DatabaseAccess.getInstance(context).getBreak();

                String text = quotes.get(0);
                int duration = Toast.LENGTH_SHORT;

                Toast.makeText(context, text, duration).show();
            }
        });

//        ImageButton newRouteButton = (ImageButton) v.findViewById(R.id.NewRouteButton);

//        newRouteButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v)
//            {
//                android.app.FragmentTransaction transaction = getFragmentManager().beginTransaction();
//                transaction.replace(R.id.content_main,new MapHandler());
//                transaction.addToBackStack(null);
//                transaction.commit();
//            }
//        });

        return v;
    }


    @Override public void onDetach() {
        super.onDetach();
    }
    @Override public void onPause() {
        super.onPause();
    }
    @Override public void onDestroy() {
        super.onDestroy();
    }
    @Override public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
    }
    @Override public void onLowMemory()
    {
        super.onLowMemory();
    }
    @Override public void onResume() {
        super.onResume();
    }
    @Override public void onDestroyView() {
        super.onDestroyView();
    }
}
