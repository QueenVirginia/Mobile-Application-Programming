package umn.ac.id.week03_29272;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.View;

import android.view.Menu;
import android.view.MenuItem;

import java.util.LinkedList;
import java.util.Objects;

public class MainActivity extends AppCompatActivity {
    private final LinkedList<String> mDaftarKata = new LinkedList<>();
    private RecyclerView mReyclerView;
    private DaftarKataAdapter mAdapater;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int jumlahKata = mDaftarKata.size();
                mDaftarKata.addLast("Kata " + (jumlahKata + 1) + " telah ditambahkan");
                Objects.requireNonNull(mReyclerView.getAdapter()).notifyItemInserted(jumlahKata);
                mReyclerView.smoothScrollToPosition(jumlahKata);
            }
        });

        for (int i = 1; i < 21; i++){
            mDaftarKata.add("Kata "+i);
        }

        mReyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        mAdapater = new DaftarKataAdapter(this, mDaftarKata);
        mReyclerView.setAdapter(mAdapater);
        mReyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}