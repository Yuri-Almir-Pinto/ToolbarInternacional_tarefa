package com.example.toolbarinternacional;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.toolbarinternacional.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setSupportActionBar(binding.toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.action_menu, menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.act_add) {
            Toast.makeText(this, R.string.toast_add_contact, Toast.LENGTH_SHORT).show();
        }
        if (item.getItemId() == R.id.act_edit) {
            Toast.makeText(this, R.string.toast_edit_contact, Toast.LENGTH_SHORT).show();
        }
        if (item.getItemId() == R.id.act_remove) {
            Toast.makeText(this, R.string.toast_remove_contact, Toast.LENGTH_SHORT).show();
        }
        if (item.getItemId() == R.id.act_help) {
            Toast.makeText(this, R.string.toast_help, Toast.LENGTH_SHORT).show();
        }

        return super.onOptionsItemSelected(item);
    }
}