package com.activity6.Activity6.model

import javax.persistence.*


@Table(name = "BloodBank")
@Entity
data class BloodBank(
    @Id
    var emp_id:Int,
    var blood_bag_no:Int,
    var description:String
)