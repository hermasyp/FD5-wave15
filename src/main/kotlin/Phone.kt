open class Phone(
    val screenSize: Int,
    val processor: String,
    val operatingSystem: String,
    val batteryCapacity: Int,
    val ram: Int
) {

    open fun call(phoneNumber: String) {
        call(phoneNumber,false)
    }

    open fun call(phoneNumber: String, isUsingPrivateNumber: Boolean) {
        println("Calling : $phoneNumber")
        if(isUsingPrivateNumber) println("Using Private Number")
    }

    open fun sendSms(phoneNumber: String) {
        println("Send Message To :  $phoneNumber")
    }
}