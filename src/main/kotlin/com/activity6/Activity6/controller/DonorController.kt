package com.activity6.Activity6.controller

import com.activity6.Activity6.dto.Response
import com.activity6.Activity6.model.Donor
import com.activity6.Activity6.repository.BloodRepo
import com.activity6.Activity6.repository.DonorRepository
import com.activity6.Activity6.service.DonorService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import java.util.*

@RestController
class DonorController(@Autowired val donorService: DonorService ,@Autowired val donorRepository: DonorRepository,
            @Autowired var bloodRepo: BloodRepo
                      ){

    @GetMapping("/donors")
    fun getStudents(): MutableList<Donor?> {
        return donorService.retrieveAllDonors()
    }


    @PostMapping("/donor")
    fun addDonor(@RequestBody donor: Donor): Donor {
        return donorRepository.save(donor)
    }

    @GetMapping("/joinInfo")
    fun getJoinInformation(): List<Response?>? {
        return donorRepository.joinInformation

    }
}