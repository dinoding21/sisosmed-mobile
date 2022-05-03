package com.amary.sisosmed.domain.usecase

import androidx.paging.CombinedLoadStates
import androidx.paging.PagingData
import com.amary.sisosmed.core.Resource
import com.amary.sisosmed.domain.model.Login
import com.amary.sisosmed.domain.model.Message
import com.amary.sisosmed.domain.model.Story
import kotlinx.coroutines.flow.Flow

interface UseCase {
    fun register(
        name: String,
        email: String,
        password: String
    ): Flow<Resource<Message>>

    fun login(
        email: String,
        password: String
    ): Flow<Resource<Login>>

    fun allStories(): Flow<PagingData<Story>>

    fun pagerResource(loadState: CombinedLoadStates) : Flow<Resource<Unit>>

    fun checkAuth(): Flow<Resource<Boolean>>

    fun clearAuth(): Flow<Boolean>

    fun getUserName(): Flow<String>
}