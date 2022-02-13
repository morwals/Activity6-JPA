package com.activity6.Activity6.model

import javax.persistence.*


@Table(name = "Blood")
@Entity
data class Blood(
    @Id
    var bid: Int,
    var blood_type:String,
    var blood_bag_no:Int,
    var code:Int,
//


)