package com.example.vlad.alphatest.di.modules;

import android.content.Context;

import com.example.vlad.alphatest.interfaceses.api.GalleryApi;
import com.example.vlad.alphatest.managers.StorageManager;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.storage.FirebaseStorage;

import dagger.Module;
import dagger.Provides;

@Module
public class ManagersModule {

    @Provides
    StorageManager provideStorageManager(Context context) {
        return new StorageManager(context);
    }
}
