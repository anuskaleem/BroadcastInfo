package activities.among.communication.tutorials.anus.com.broadcastinfo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.ShareCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class RequestTextChange extends AppCompatActivity {
    EditText editText;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_request_text_change);

        editText = (EditText) findViewById(R.id.edit_text_changed_text);
        btn = (Button) findViewById(R.id.broadcast_changed_text);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Intent intent = new Intent("request.changed.text");
        intent.putExtra("changed_text",editText.getText().toString());
        sendBroadcast(intent);

    }
}
