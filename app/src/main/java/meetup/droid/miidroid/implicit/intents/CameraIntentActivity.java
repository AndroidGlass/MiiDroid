package meetup.droid.miidroid.implicit.intents;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import meetup.droid.miidroid.R;

public class CameraIntentActivity extends AppCompatActivity implements View.OnClickListener {

    private static final int CAPTURE_PHOTO_REQUEST_CODE = 0x123;

    private ImageView mPicView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camera_intent);

        mPicView = (ImageView) findViewById(R.id.iv_image);
        findViewById(R.id.btn_take_pic).setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_take_pic:
                launchCamera();
                break;
        }
    }

    private void launchCamera() {
        Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivityForResult(intent, CAPTURE_PHOTO_REQUEST_CODE);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == CAPTURE_PHOTO_REQUEST_CODE) {
            if (resultCode == RESULT_OK) {

                Bitmap bitmap = (Bitmap) data.getExtras().get("data");
                mPicView.setImageBitmap(bitmap);
            }
        }
    }
}
