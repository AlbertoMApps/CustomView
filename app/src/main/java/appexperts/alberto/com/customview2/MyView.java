package appexperts.alberto.com.customview2;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by alber on 24/02/2016.
 */
public class MyView extends View {

    private int temp;
    private Bitmap bitmap;
    public MyView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public MyView(Context context, AttributeSet attrs) {
        super(context, attrs);
        Resources res = context.getResources();
        bitmap = BitmapFactory.decodeResource(res, R.drawable.images);
    }

    public MyView(Context context) {
        super(context);
    }

    public void setTemp( int temp ){
        this.temp = temp;
        this.invalidate();
    }

    @Override
    protected void onDraw(Canvas canvas){
        super.onDraw(canvas);
        if (bitmap!=null) {
            canvas.drawBitmap(bitmap, temp*10 ,temp *10, null); //bitmap, floatLeft,floatTop,painting
        }
    }
}
