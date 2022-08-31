class App {

    fun run() {
        val android = AndroidPhone(
            screenSize = 8,
            processor = "Snapdragon 888",
            batteryCapacity = 5000,
            ram = 12,
            androidVersion = "Tiramissu"
        )
        android.call("081204815",true)
        android.installCustomRom("Cyanogen")
        println()
        val ios = Iphone(
            screenSize = 6,
            processor = "Apple Bionic ",
            batteryCapacity = 4500,
            ram = 8,
            iosVersion = "IOS 16"
        )
        ios.call("081204815")
        ios.sendAirdrop("1234")
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            App().run()
        }
    }
}