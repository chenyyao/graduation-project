package cn.edu.bistu.orderdishes;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActionBar actionbar = getSupportActionBar();
        if (actionbar != null){
            actionbar.hide();
        }

        imageView=(ImageView)findViewById(R.id.image);
        imageView.setImageResource(R.drawable.timg);

        AlphaAnimation animation = new AlphaAnimation(0,1);
        animation.setDuration(2000);
        imageView.startAnimation(animation);

        animation.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

//            @Override
//            public void onAnimationEnd(Animation animation) {
//                AlphaAnimation alphaAnimation = new AlphaAnimation(1, 0);
//                alphaAnimation.setDuration(1500);
//                imageView.startAnimation(animation);
//                animation.setFillAfter(true);
//                animation.setAnimationListener(new Animation.AnimationListener() {
//                    @Override
//                    public void onAnimationStart(Animation animation) {
//
//                    }

                    @Override
                    public void onAnimationEnd(Animation animation) {
                        AlphaAnimation alphaAnimation = new AlphaAnimation(1, 0);
                        alphaAnimation.setDuration(2000);
                        imageView.startAnimation(animation);
                        Intent intent = new Intent(MainActivity.this, LoginActivity.class);
                        startActivity(intent);
                        MainActivity.this.finish();
                    }

                    @Override
                    public void onAnimationRepeat(Animation animation) {

                    }
                });
            }

//            @Override
//            public void onAnimationRepeat(Animation animation) {
//
//            }
//        });
//    }
}
