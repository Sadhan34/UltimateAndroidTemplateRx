package com.androidadvance.ultimateandroidtemplaterx.injection.component;


import android.app.Application;
import android.content.Context;


import com.androidadvance.ultimateandroidtemplaterx.injection.ApplicationContext;
import com.androidadvance.ultimateandroidtemplaterx.injection.module.ApplicationModule;

import javax.inject.Singleton;

import dagger.Component;
import de.greenrobot.event.EventBus;

//import dagger.Component;
//import uk.co.ribot.androidboilerplate.data.DataManager;
//import uk.co.ribot.androidboilerplate.data.SyncService;
//import uk.co.ribot.androidboilerplate.data.local.DatabaseHelper;
//import uk.co.ribot.androidboilerplate.data.local.PreferencesHelper;
//import uk.co.ribot.androidboilerplate.data.remote.RibotsService;
//import uk.co.ribot.androidboilerplate.injection.ApplicationContext;
//import uk.co.ribot.androidboilerplate.injection.module.ApplicationModule;

@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {

//    void inject(SyncService syncService);
//
     @ApplicationContext Context context();
     Application application();
//    RibotsService ribotsService();
//    PreferencesHelper preferencesHelper();
//    DatabaseHelper databaseHelper();
//    DataManager dataManager();
      EventBus eventBus();

}