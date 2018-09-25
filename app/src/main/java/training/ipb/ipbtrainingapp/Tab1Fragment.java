package training.ipb.ipbtrainingapp;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class Tab1Fragment extends Fragment {
    private ListView nListView;
    private RequestQueue mRequestQueue;
    private ArrayList<String> dataList;
    private String url = "http://mauldev.tech/suarakami/api/video_get.php";
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_tab1, container, false);

        //Mendownload data
        dataList = new ArrayList<>();
        mRequestQueue = Volley.newRequestQueue(getContext());
        loadData();

        //Menampilkan data
        nListView = view.findViewById(R.id.dataListView);
        return view;
    }

    private void loadData() {
        JsonObjectRequest request = new JsonObjectRequest(Request.Method.GET, url, (String) null, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {
                try {
                    JSONArray jsonArray = response.getJSONArray("data");

                    //Loop data
                    for (int i = 0; i<jsonArray.length();i++){
                        JSONObject hit = jsonArray.getJSONObject(i);
                        String judulVideo = hit.getString("judul");

                        //masukkan judul ke dalam list
                       dataList.add(judulVideo);
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                //Case 2
                ArrayAdapter<String> adapter = new ArrayAdapter<String>(getContext(), R.layout.list_view_item, dataList);
                nListView.setAdapter(adapter);
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                error.printStackTrace();
            }
        });
        mRequestQueue.add(request);
    }
}
