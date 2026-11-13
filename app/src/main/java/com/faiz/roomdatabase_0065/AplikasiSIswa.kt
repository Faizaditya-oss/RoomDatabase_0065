package com.faiz.roomdatabase_0065

import android.app.Application
import com.faiz.roomdatabase_0065.repositori.ContainerApp
import com.faiz.roomdatabase_0065.repositori.ContainerDataApp

class AplikasiSiswa : Application() {
    /**
     * AppContainer instance digunakan oleh kelas-kelas lainnya untuk mendapatkan dependensi
     */
    lateinit var container: ContainerApp

    override fun onCreate() {
        super.onCreate()
        container = ContainerDataApp(this)
    }
}