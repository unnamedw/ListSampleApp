package com.doachgosum.listsampleapp.domain.repository

import com.doachgosum.listsampleapp.domain.model.PhotoModel

interface PhotoRepository {

    suspend fun getPhotos(): List<PhotoModel>
}