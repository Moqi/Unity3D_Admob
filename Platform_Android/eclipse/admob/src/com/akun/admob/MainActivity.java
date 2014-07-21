package com.akun.admob;

import android.app.Activity;
import android.os.Bundle;
import android.widget.LinearLayout;

import com.google.ads.AdRequest;
import com.google.ads.AdSize;
import com.google.ads.AdView;
//import com.unity3d.player.UnityPlayerActivity;


public class MainActivity extends Activity  {
	 private AdView adView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       
        
        
     // 创建adView
        adView = new AdView(this, AdSize.BANNER, "ca-app-pub-2705592372365630/2055901108");

        // 查询LinearLayout，假设其已指定
        // 属性android:id="@+id/mainLayout"
        //LinearLayout layout = (LinearLayout)findViewById(R.id.mainLayout);
        LinearLayout layout = new LinearLayout(this);
        // 在其中添加adView
        layout.addView(adView);

        // 启动一般性请求并在其中加载广告
        adView.loadAd(new AdRequest());
    }

    public void onDestroy() {
        if (adView != null) {
          adView.destroy();
        }
        super.onDestroy();
      }

}
