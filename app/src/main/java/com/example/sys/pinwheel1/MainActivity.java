package com.example.sys.pinwheel1;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.os.Bundle;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    /*MainActivity 자바 클래스가 호출할 때 처음 실행되는 메소드*/
    protected void onCreate(Bundle savedInstanceState) {
        /*액티비티 생성*/
        super.onCreate(savedInstanceState);
        /*activity_main.xml에서 정의된 화면 레이아웃을 액티비티에 출력*/
        setContentView(R.layout.activity_main);

        /*id가 pinwheel인 이미지를 인식함*/
        ImageView iv_pingwhell =(ImageView)findViewById(R.id.pinwheel);

        /*인식한 이미지를 360도 회전시키는 애니메이션 객체 생성*/
        ObjectAnimator object = ObjectAnimator.ofFloat(iv_pingwhell, "rotation",360);

        /*일정한 속도로 움직이게 함*/
        object.setInterpolator(new LinearInterpolator());

        /*애니메이션 시간을 2초로 설정*/
        object.setDuration(2000);

        /*애니메이션을 무한번 반복하도록 설정*/
        object.setRepeatCount(ValueAnimator.INFINITE);

        /*애니메이션을 실행함*/
        object.start();

    }
}
