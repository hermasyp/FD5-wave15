class AndroidPhone(
    screenSize: Int,
    processor: String,
    batteryCapacity: Int,
    ram: Int,
    var androidVersion: String
) : Phone(screenSize, processor, "Android", batteryCapacity, ram) {

    override fun call(phoneNumber: String) {
        super.call(phoneNumber)
        println("Calling from $operatingSystem")
        println("in Android Version $androidVersion")
    }

    override fun call(phoneNumber: String, isUsingPrivateNumber: Boolean) {
        super.call(phoneNumber, isUsingPrivateNumber)
        println("Calling from $operatingSystem")
        println("in Android Version $androidVersion")
    }

    fun installCustomRom(androidVersion: String){
        this.androidVersion = androidVersion
        println("Installing Custom rom : $androidVersion")
    }
}

class Iphone(
    screenSize: Int,
    processor: String,
    batteryCapacity: Int,
    ram: Int,
    val iosVersion : String
) : Phone(screenSize, processor, "IOS", batteryCapacity, ram) {

    override fun call(phoneNumber: String) {
        super.call(phoneNumber)
        println("Calling from $operatingSystem")
        println("Ios version is $iosVersion")
    }
    fun sendAirdrop(bluetoothId : String){
        println("Send Airdrop to : $bluetoothId")
    }

}