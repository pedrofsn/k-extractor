object extract {

    infix fun safe(value: String?): String = value ?: ""
    infix fun safe(value: Int?): Int = value ?: -1
    infix fun safe(value: Boolean?): Boolean = value ?: false
    infix fun safe(value: Float?): Float = value ?: 0.0f
    infix fun safe(value: Double?): Double = value ?: 0.0
    infix fun safe(value: Long?): Long = value ?: -1

}