package com.test_bar;

import android.app.Application;
import android.content.Context;
import com.facebook.react.PackageList;
import com.facebook.react.ReactApplication;
import com.facebook.react.ReactNativeHost;
import com.facebook.react.ReactPackage;
import com.facebook.soloader.SoLoader;
import java.lang.reflect.InvocationTargetException;

import java.util.Arrays;
import java.util.List;
import androidx.annotation.Nullable;

// React Native Navigation
import com.reactnativenavigation.NavigationApplication;
import com.reactnativenavigation.react.NavigationReactNativeHost;

public class MainApplication extends NavigationApplication {

    @Override
    protected ReactNativeHost createReactNativeHost() {
        return new NavigationReactNativeHost(this) {
            @Override
            protected String getJSMainModuleName() {
                return "index";
            }
        };
    }

    @Override
    public boolean isDebug() {
        return BuildConfig.DEBUG;
    }


    @Nullable
    @Override
    public List<ReactPackage> createAdditionalReactPackages() {
        List<ReactPackage> packages = Arrays.<ReactPackage>asList(
        );
        return packages;
    }

}
