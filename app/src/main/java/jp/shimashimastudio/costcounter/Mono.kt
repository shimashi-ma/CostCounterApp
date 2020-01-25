package jp.shimashimastudio.costcounter

import android.app.Application
import io.realm.Realm

class Mono: Application() {
    override fun onCreate() {
        super.onCreate()
        //Realmの初期化
        Realm.init(this)
    }
}