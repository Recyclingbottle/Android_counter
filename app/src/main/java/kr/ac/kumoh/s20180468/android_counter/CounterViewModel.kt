package kr.ac.kumoh.s20180468.android_counter

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CounterViewModel: ViewModel() {
    private var _count = MutableLiveData<Int>(0)
    val count:LiveData<Int>
        get() = _count

    fun add() {
        _count.value = _count.value?.plus(1)
    }
    fun minus() {
        _count.value = _count.value?.minus(1)
    }

}