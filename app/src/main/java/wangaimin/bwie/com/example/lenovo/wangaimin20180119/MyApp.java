package wangaimin.bwie.com.example.lenovo.wangaimin20180119;

import android.app.Application;

import wangaimin.bwie.com.example.lenovo.wangaimin20180119.gen.DaoMaster;
import wangaimin.bwie.com.example.lenovo.wangaimin20180119.gen.DaoSession;
import wangaimin.bwie.com.example.lenovo.wangaimin20180119.gen.UserDao;


/**
 * Created by Zhang on 2017/11/22.
 */

public class MyApp extends Application {
    public static UserDao userDao;

    @Override
    public void onCreate() {
        super.onCreate();
        DaoMaster.DevOpenHelper devOpenHelper = new DaoMaster.DevOpenHelper(this, "lenvess.db", null);
        DaoMaster daoMaster = new DaoMaster(devOpenHelper.getWritableDb());
        DaoSession daoSession = daoMaster.newSession();
        userDao = daoSession.getUserDao();
    }
}