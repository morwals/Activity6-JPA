package com.activity6.Activity6.repository

import com.activity6.Activity6.dto.Response
import com.activity6.Activity6.model.Donor
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.stereotype.Repository

@Repository
interface DonorRepository: JpaRepository<Donor?,Int?>{
    @get:Query("SELECT new com.activity6.Activity6.dto.Response(c.donor_name , b.blood_type) From Donor c JOIN c.blood b")
    val joinInformation :List<Response?>?
}
