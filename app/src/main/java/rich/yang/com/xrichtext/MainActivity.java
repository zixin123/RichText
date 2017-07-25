package rich.yang.com.xrichtext;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button button_create;
    private Button button_edit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button_create = (Button) findViewById(R.id.button_create);
        button_edit = (Button) findViewById(R.id.button_edit);
    }
}
