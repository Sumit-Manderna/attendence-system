package com.example.facedetection;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toolbar;

import androidx.appcompat.app.AppCompatActivity;

import org.opencv.android.OpenCVLoader;

public class MainActivity extends AppCompatActivity  {
//    Button loadButton;
//    Button detectButton;
//    ImageView imageView1;
//    ImageView imageView2;
//    String imagePathloaded;
//    Mat matrix;
//    @Override
//    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
//        super.onActivityResult(requestCode, resultCode, data);
//        if(requestCode == 300){
//            Uri uri = data.getData();
//            imageView1.setImageURI(uri);
//            imagePathloaded =getAbsolutePath(uri);
//            matrix = Imgcodecs.imread(imagePathloaded);
//
//        }
//    }
//    private String getAbsolutePath(Uri uri){
//        String[] proj = {MediaStore.Images.Media.DATA};
//        Cursor cursor= managedQuery(uri,proj,null,null,null);
//        int column_index = cursor.getColumnIndexOrThrow(MediaStore.Images.Media.DATA);
//        cursor.moveToFirst();
//        return cursor.getString(column_index);
//    }
//
//    public void detectFace(Mat img){
//        Imgproc.cvtColor(img,img,Imgproc.COLOR_RGB2BGRA);
//
//        Mat matrix= img.clone();
//
//        CascadeClassifier cascadeClassifier=new CascadeClassifier();
//        try{
//
//            InputStream is = this.getResources().openRawResource(R.raw.haarcascade_frontalface_alt2);
//            File cascadeDir= getDir("cascade", Context.MODE_PRIVATE);
//            File mCascadeFile = new File(cascadeDir,"haarcascade_frontalface_alt2.xml");
//            FileOutputStream os= new FileOutputStream(mCascadeFile);
//            byte[] buffer =new byte[4096];
//            int bytesRead;
//            while((bytesRead=is.read(buffer))!=-1){
//                os.write(buffer,0,bytesRead);
//            }
//            is.close();
//            os.close();
//
//            cascadeClassifier =new CascadeClassifier(mCascadeFile.getAbsolutePath());
//        } catch (Exception e) {
//            Log.e("openCVActivity","error loading cascade",e);
//        }
//
//        MatOfRect faceArray = new MatOfRect();
//        cascadeClassifier   .detectMultiScale(matrix,faceArray);
//
//        int numfaces=faceArray.toArray().length;
//        for(Rect face: faceArray.toArray()){
//            Imgproc.rectangle(matrix,
//                    new Point(face.x , face.y),
//                    new Point(face.x+face.width,face.y+face.height),
//                    new Scalar(255,0,0),5);
//        }
//
//        Mat finalMatrix= matrix.clone();
//        Bitmap bitmap=Bitmap.createBitmap(finalMatrix.cols(),finalMatrix.rows(), Bitmap.Config.ARGB_8888);
//        Utils.matToBitmap(finalMatrix,bitmap);
//        imageView2.setImageBitmap(bitmap);
//
//        Toast.makeText(getApplicationContext(), numfaces+"faces found ", Toast.LENGTH_SHORT).show();
//    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        OpenCVLoader.initDebug();
        setContentView(R.layout.activity_main);

//        ActivityCompat.requestPermissions(MainActivity.this,new  String[]
//                {Manifest.permission.WRITE_EXTERNAL_STORAGE},200);
//        loadButton = findViewById(R.id.btn);
//        detectButton = findViewById(R.id.detect);
//        imageView1 =findViewById(R.id.imageview1);
//        imageView2 = findViewById(R.id.imageview2);
//
//        loadButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent =new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.INTERNAL_CONTENT_URI);
//                startActivityForResult(intent,300);
//            }
//        });


//        detectButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                detectFace(matrix);
//            }
//        });

        Toolbar toolbar = (Toolbar) findViewById(R.id.app_bar);
        setSupportActionBar(toolbar);


        if(getSupportActionBar() != null) {
            getSupportActionBar().setTitle("Marvel");
        }

        Button recognizeButton = (Button) findViewById(R.id.recognizeButton);
        Button trainingButton = (Button) findViewById(R.id.trainingButton);

        recognizeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Recognize.class));
            }
        });

        trainingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, NameActivity.class));
            }
        });

    }

    private void setSupportActionBar(Toolbar toolbar) {
    }


}