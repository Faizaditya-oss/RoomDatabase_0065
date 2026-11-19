package com.faiz.roomdatabase_0065.viewmodel


import android.app.Application
import com.faiz.roomdatabase_0065.repositori.AppDataContainer
import com.faiz.roomdatabase_0065.repositori.ContainerApp

class AplikasiSiswa : Application() {
    /**
     * AppContainer instance digunakan oleh kelas-kelas lainnya untuk mendapatkan dependensi.
     */
    lateinit var container: ContainerApp

    override fun onCreate() {
        super.onCreate()
        container = AppDataContainer(this)
    }
}