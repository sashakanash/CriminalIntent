package com.sample.criminalintent

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.switchMap
import java.util.UUID

private const val TAG = "CrimeDetail"
class CrimeDetailViewModel(): ViewModel() {
    private val crimeRepository = CrimeRepository.get()
    private val crimeIdLiveData = MutableLiveData<UUID>()

    var crimeLiveData: LiveData<Crime?> = crimeIdLiveData.switchMap {
        crimeRepository.getCrime(it)
    }
    fun loadCrime(crimeId: UUID){
        crimeIdLiveData.value = crimeId
    }

}