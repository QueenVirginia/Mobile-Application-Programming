package umn.ac.id.week07b_29272;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;

import java.util.LinkedList;

public class MainActivity extends AppCompatActivity {

    RecyclerView rvDaftarVideo;
    DaftarVideoAdapter mAdapter;
    LinkedList<SumberVideo> daftarVideo = new LinkedList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        isiDaftarVideo();
        rvDaftarVideo = (RecyclerView) findViewById(R.id.recyclerView);
        mAdapter = new DaftarVideoAdapter(this, daftarVideo);
        rvDaftarVideo.setAdapter(mAdapter);
        rvDaftarVideo.setLayoutManager(new LinearLayoutManager(this));
    }

    public void isiDaftarVideo(){
        daftarVideo.add(new SumberVideo("Mini Cooper Drag", "Drag Race Mini Cooper dengan Honda Civic hatchback", "android.resource://" +getPackageName() + "/"+ R.raw.mini01));
        daftarVideo.add(new SumberVideo("Mini Cooper Drag Race", "Drag Race Mini Cooper dengan Ford Fiesta hatchback", "android.resource://" +getPackageName() + "/"+ R.raw.mini02));
    }

}