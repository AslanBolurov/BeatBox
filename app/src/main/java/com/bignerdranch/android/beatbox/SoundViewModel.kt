package com.bignerdranch.android.beatbox

import androidx.databinding.BaseObservable
import androidx.databinding.Bindable
import androidx.databinding.Observable

class SoundViewModel(
    private val beatBox: BeatBox
):BaseObservable() {


    fun onButtonClicked() {
        sound?.let {
            beatBox.play(it)
        }
    }


    var sound:Sound? = null
        set(sound) {
            field=sound
//             notifyChange()
           notifyPropertyChanged(BR.title)
        }
    @get:Bindable
    val title:String?
        get() = sound?.name

}
