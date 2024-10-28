package com.nfd.dicodingevent.ui.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.nfd.dicodingevent.ui.settings.SettingPreferences

class ViewModelSettingsFactory(private val pref: SettingPreferences) :
    ViewModelProvider.NewInstanceFactory() {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(MainSettingsModel::class.java)) {
            return MainSettingsModel(pref) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class : " + modelClass.name)
    }
}