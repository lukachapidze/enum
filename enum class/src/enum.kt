// shevkmenit enum class i da davarkvit CardType, romelshic movatavset sami saxis karta
enum class CardType {
    SILVER, GOLD, PLATINUM
}

// mivanichet titoeul matgans feri
enum class CardType(val color: String) {
    SILVER("gray"),
    GOLD("yellow"),
    PLATINUM("black")
}

// ese shegvidzlia movipovot wvdoma ferze kartis mixedvit
val color = CardType.SILVER.color

// gamovikenet override function da mivanichet titoeul kartas sxvadasxva cashback - i
enum class CardType {
    SILVER {
        override fun calculateCashbackPercent() = 0.25f
    },
    GOLD {
        override fun calculateCashbackPercent() = 0.5f
    },
    PLATINUM {
        override fun calculateCashbackPercent() = 0.75f
    };

    abstract fun calculateCashbackPercent(): Float
}

// esec igives aketebs ubralod cashback ze gvacvdis informacias kartis mixedvit
val cashbackPercent = CardType.SILVER.calculateCashbackPercent()

// igivenairad shegvidzlia davamatot limiti titoeul kartaze
enum class CardType : ICardLimit {
        SILVER
    {
                override fun getCreditLimit() = 100000
            
    },
        GOLD
    {
                override fun getCreditLimit() = 200000
            
    },
        PLATINUM
    {
                override fun getCreditLimit() = 300000
            
    }
}

// da movipovot wvdoma limitze kartis mixedvit
val creditLimit = CardType.PLATINUM.getCreditLimit()