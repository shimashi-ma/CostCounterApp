package jp.shimashimastudio.costcounter

import android.media.Image
import io.realm.RealmObject
import io.realm.annotations.PrimaryKey
import java.util.*
import java.io.Serializable  //生成したオブジェクトをシリアライズできるインターフェース（データを丸ごと保存したり、別のActivityに渡すことができる)


//データベースのモデルクラスの作成
open class MonoDB : RealmObject(), Serializable {


    //モノの名前
    var monoName: String = ""

    //使いはじめた日
    var date: Date = Date()

    //買ったときの値段
    var monoNedan: Int = 0

    //メモ
    var memo :String = ""

    //写真
    var image: Image? = null //とりあえず

    // id をプライマリーキーとして設定
    @PrimaryKey var id: Int = 0

}