package com.activity6.Activity6.repository

import com.activity6.Activity6.model.Blood
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface BloodRepo :JpaRepository<Blood,Int>