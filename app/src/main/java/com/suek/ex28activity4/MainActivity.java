package com.suek.ex28activity4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }




    public void clickBtn(View view) {
        //묵시적 인텐트로 실행 [ 액티비티 클래스명 없이 실행하기 ]= 이름이 숨겨져있음, 암시적
        Intent intent= new Intent();
        //그 액티비티의 고유한 식별자같은 키워드 설정 (ex;인사담담자 앞으로)/ 홍길동으로 안해도
        intent.setAction("인사담당자"); //SecondActivity(홍길동) 라는 명시적 이름을 쓰지 않고도 사용가능-> Manifest 의 intent filter 을 통해
                                       // intent 가 intent.setAction("인사담당자")를 가져감
        intent.setAction("회계담당자");
        //intent.setAction("디자인담당자");  // 이 담당자는 (manifest 에 설정안됨) 없기때문에 실행이 안됨->액티비티 꺼짐
        startActivity(intent);

    }
}
