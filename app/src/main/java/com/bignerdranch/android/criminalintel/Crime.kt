package com.bignerdranch.android.criminalintel

import android.icu.text.CaseMap
import java.util.*


class Crime(var id: UUID = UUID.randomUUID()){
    var title: String = ""
    var date: Int = 0
    var isSoul: Boolean = false

    constructor(id: UUID, title: String, date: Int, isSoul: Boolean) : this(id){
        this.title = title
        this.date = date
        this.id = id
        this.isSoul = isSoul
    }

}