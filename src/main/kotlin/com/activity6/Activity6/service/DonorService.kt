package com.activity6.Activity6.service

import com.activity6.Activity6.model.Donor
import com.activity6.Activity6.repository.DonorRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.util.*

@Service
class DonorService(@Autowired val donorRepository: DonorRepository){

    fun retrieveAllDonors(): MutableList<Donor?> {
        return donorRepository.findAll()
    }

    fun add(donor: Donor): Donor {
        return donorRepository.save(donor)
    }

    fun retrieveDonorsByID(id: Int): Optional<Donor?> {
        return donorRepository.findById(id)
    }


}