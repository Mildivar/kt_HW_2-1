fun main(){
    val amount = 59665
    val amountMinimum = 3500
    val amountPercent = (amount * 75)/1000
    if(amount < amountMinimum) {println("Недостаточно средств для перевода.")}
    else if (amountPercent < amountMinimum) {
        val amountCommission = amount - amountMinimum
        println("Комиссия составляет: $amountMinimum коп.")
        println("Сумма к оплате: $amountCommission коп.")
    }
    else {
        val amountCommission = amount - amountPercent
        println("Комиссия составляет: $amountPercent коп.")
        println("Сумма к оплате: $amountCommission коп.")
    }
}