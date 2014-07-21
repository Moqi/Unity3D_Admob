package com.akun.admob;

import com.google.ads.AdRequest;
import com.google.ads.AdSize;
import com.google.ads.AdView;
import com.unity3d.player.UnityPlayerActivity;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.os.Build;

public class MainActivity extends UnityPlayerActivity  {
	 private AdView adView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       
        
        
     // ����adView
        adView = new AdView(this, AdSize.BANNER, "ca-app-pub-2705592372365630/2055901108");

        // ��ѯLinearLayout����������ָ��
        // ����android:id="@+id/mainLayout"
        //LinearLayout layout = (LinearLayout)findViewById(R.id.mainLayout);
        LinearLayout layout = new LinearLayout(this);
        // ���������adView
        layout.addView(adView);

        // ����һ�������������м��ع��
        adView.loadAd(new AdRequest());
    }

    public void onDestroy() {
        if (adView != null) {
          adView.destroy();
        }
        super.onDestroy();
      }

}
