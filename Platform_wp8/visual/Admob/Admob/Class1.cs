using System;
using System.Net;
using System.Windows;
using System.Windows.Controls;
using System.Windows.Documents;
using System.Windows.Ink;
using System.Windows.Input;
using System.Windows.Media;
using System.Windows.Media.Animation;
using System.Windows.Shapes;
using GoogleAds;
using Microsoft.Phone.Controls;

namespace Admob
{
    public class Class1 : PhoneApplicationPage
    {
          public MainPage()
        {
            InitializeComponent();
            // NOTE: Edit "MY_AD_UNIT_ID" with your ad unit id.
            AdView bannerAd = new AdView
            {
                Format = AdFormats.Banner,
                AdUnitID = "MY_AD_UNIT_ID"
            };
            bannerAd.ReceivedAd += OnAdReceived;
            bannerAd.FailedToReceiveAd += OnFailedToReceiveAd;
            LayoutRoot.Children.Add(bannerAd);
            AdRequest adRequest = new AdRequest();
            adRequest.ForceTesting = true;
            bannerAd.LoadAd(adRequest);
        }
    }
}
