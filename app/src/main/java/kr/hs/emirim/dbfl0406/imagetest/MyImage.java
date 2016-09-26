package kr.hs.emirim.dbfl0406.imagetest;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.view.View;

/**
 * Created by appcreator04 on 2016. 9. 26..
 */
public class MyImage extends View {
    MyImage(Context context) { //이 뷰가 들어갈 문맥
        super(context); //뷰 클래스는 디폴트 생성자가 없어
    }

    protected void onDraw(Canvas canvas){
        super.onDraw(canvas);
        Bitmap picture= BitmapFactory.decodeResource(getResources(),R.drawable.img1);
        float cx=getWidth()/2.0f;
        float cy=getHeight()/2.0f;
        float x=(getWidth()-picture.getWidth())/2.0f; //현재 뷰의 넓이-사진 넓이
        float y=(getHeight()-picture.getHeight())/2.0f;
        //canvas.rotate(180,cx,cy);
        //canvas.translate(-150,200);
        //canvas.scale(0.5f,0.5f,cx,cy); //넓이 2배, 높이 2배, 기준
        canvas.skew(0.4f,0.4f); //0~1
        canvas.drawBitmap(picture,x,y,null);
    }
}
