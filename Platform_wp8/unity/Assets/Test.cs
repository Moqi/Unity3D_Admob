using UnityEngine;
using System.Collections;
using windowsphoneplugin;

public class Test : MonoBehaviour
{

    string test;
    // Use this for initialization
    void Start()
    {
        test = windowsphoneplugin.Class1.GetDeviceName;
        Debug.Log(test);
    }


    void OnGUI()
    {
        GUI.Label(new Rect(Screen.width*0.5f, Screen.height*0.5f, 300, 40), test);
    }
}
