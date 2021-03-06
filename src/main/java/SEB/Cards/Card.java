package SEB.Cards;

public class Card {
    private String cardId;
    private String cardName;
    private int damage;
    private String elementType;
    private String cardType;

    public Card(String Id, String Name, int Damage, String eType, String cType){
        this.cardId = Id;
        this.cardName = Name;
        this.damage = Damage;
        this.elementType = eType;
        this.cardType = cType;
    }

    public String getCardId() {
        return cardId;
    }

    public String getCardName() {
        return cardName;
    }

    public int getDamage() {
        return damage;
    }

    public String getElementType() {
        return elementType;
    }

    public String getCardType() {
        return cardType;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
}
