class CatRetailer : Retailer<Cat> {

    override fun sell(): Cat {
        println("Sell Cat")
        return Cat("")
    }
}