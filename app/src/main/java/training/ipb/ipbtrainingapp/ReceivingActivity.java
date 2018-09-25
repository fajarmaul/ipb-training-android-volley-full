package training.ipb.ipbtrainingapp;

import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ReceivingActivity extends AppCompatActivity {
    private ViewPager pager;
    private FragmentPagerAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receiving);

        pager = findViewById(R.id.pager);
        adapter = new TabFragmentPagerAdapter(getSupportFragmentManager());
        pager.setAdapter(adapter);

    }
}
