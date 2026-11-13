package com.faiz.roomdatabase_0065.room

import kotlinx.coroutines.flow.Flow

interface SiswaDao {
    fun getAllSiswa(): Flow<List<Siswa>>
}