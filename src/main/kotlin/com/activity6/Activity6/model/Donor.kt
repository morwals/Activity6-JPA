package com.activity6.Activity6.model

import javax.persistence.*


@Table(name = "Donor")
@Entity
data class Donor(
    @Id
    @GeneratedValue
    var id: Int,
    var donor_name:String,
    var city:String,
    var phone_no:String,
    var email:String,

    @OneToMany(cascade = [CascadeType.ALL], fetch = FetchType.LAZY)
    @JoinColumn(name = "fk", referencedColumnName = "id")
    var blood: MutableList<Blood>,


    @OneToMany(cascade = [CascadeType.ALL], fetch = FetchType.LAZY)
    @JoinColumn(name = "cp_fk2", referencedColumnName = "id")
    var bloodbank: MutableList<BloodBank>
)