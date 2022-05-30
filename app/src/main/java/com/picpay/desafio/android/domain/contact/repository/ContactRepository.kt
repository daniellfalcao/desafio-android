package com.picpay.desafio.android.domain.contact.repository

import com.picpay.desafio.android.domain.contact.model.Contact

interface ContactRepository {

    suspend fun getContacts(): Result<List<Contact>>
}