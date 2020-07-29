package com.brawl.mybestappforfansbrawlstarsboxs;

import android.app.Activity;
import com.unity3d.ads.UnityAds;

public class UnityAdsConfig {
    //UnityAdsConfigDetails
    public static boolean TestModeON = true;                                  // Enable or Disable UnityAds
    public static String UnityAdsAppID = "3416089";                           // Unity Game/App ID
    public static String UnityInterstitialAdPlacement = "interstitial";       // Unity Interstitial Ad-Placement ID







    ///////////////////////// Don't Edit Anything Here /////////////////////////

    public static void loadUnityInterstitialAd() {
        UnityAds.load(UnityInterstitialAdPlacement);
    }

    public static void showUnityInterstitialAd(Activity activity) {
        if (UnityAds.isReady(UnityAdsConfig.UnityInterstitialAdPlacement)) {
            UnityAds.show(activity, UnityAdsConfig.UnityInterstitialAdPlacement);
        }
    }

}
