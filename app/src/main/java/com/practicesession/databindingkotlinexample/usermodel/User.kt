package com.practicesession.databindingkotlinexample.usermodel

class User {
    var firstName: String? = ""
    var lastName: String? = ""

    constructor(firstName: String?, lastName: String?) {
        this.firstName = firstName
        this.lastName = lastName
    }
}
